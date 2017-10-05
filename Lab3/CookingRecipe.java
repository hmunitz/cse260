package Lab3;
import java.util.ArrayList;
/**
 * Created by cebo4 on 9/14/2017.
 */
public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();

    public CookingRecipe(String name) {
        this.name = name;
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
        int index = getIndexOfIngredient(ingredient);
        if(index == -1){
            ingredients.add(new RecipeIngredient(ingredient, quantity));
        }
        else{
            RecipeIngredient i = ingredients.get(index);
            i.setQuantity(quantity);
        }
    }

    public String getName() {
        return name;
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
        return getRecipeIngredient(ingredient.getName());
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName){
        int index = getIndexOfIngredient(ingredientName);
        if(index == -1){
            return null;
        }
        else{
            return ingredients.get(index);
        }
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
        return removeRecipeIngredient(ingredient.getName());
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName){
        int index = getIndexOfIngredient(ingredientName);
        if(index == -1){
            return null;
        }
        else{
            return ingredients.remove(index);
        }
    }

    public float calculateCalories(){
        float total = 0;
        for(RecipeIngredient i : ingredients){
            total += i.getQuantity() * i.getCaloriesPerUnit();
        }
        return total;
    }

    public int getNumberOfIngredients(){
        return ingredients.size();
    }

    private int getIndexOfIngredient(String ingredientName){
        for(int i = 0; i < getNumberOfIngredients(); i++){
            if(ingredients.get(i).getName().equals(ingredientName)){
                return i;
            }
        }
        return -1;
    }

    private int getIndexOfIngredient(Ingredient ingredient){
        return getIndexOfIngredient(ingredient.getName());
    }

    public boolean containsIngredient(Ingredient i){
        return getIndexOfIngredient(i) >= 0 ? true: false;
    }

    public String toString(){
        String output = "CookingRecipe\nName= " + name + "\nIngredients= ";
        for(int i = 0; i < ingredients.size(); i++){
            output += ingredients.get(i).getName();
            if(i == ingredients.size()-1)
                output += ", ";
        }
        return output;
    }

    public boolean equals(Object other){
        if(other instanceof CookingRecipe){
            if(name.equals(((CookingRecipe) other).getName())){
                if(ingredients.size() == ((CookingRecipe) other).ingredients.size()){
                    for(Ingredient i : ingredients){
                        if(!((CookingRecipe) other).ingredients.contains(i))
                            return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
