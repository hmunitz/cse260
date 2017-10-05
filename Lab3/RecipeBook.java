package Lab3;
import java.util.ArrayList;
/**
 * Created by cebo4 on 9/14/2017.
 */
public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipes = new ArrayList<CookingRecipe>();

    public RecipeBook(String bookName) {
        this.bookName = bookName;
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
        if(isInRecipes(name) >= 0) {
            CookingRecipe recipe = new CookingRecipe(name);
            for (RecipeIngredient i : ingredients) {
                recipe.addOrUpdateRecipeIngredient(i, i.getQuantity());
            }
            return recipe;
        }
        else{
            return null;
        }
    }

    public String getBookName() {
        return bookName;
    }

    public CookingRecipe removeRecipe(String name){
        int index = isInRecipes(name);
        if(index >= 0){
            return recipes.remove(index);
        }
        else{
            return null;
        }
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
        ArrayList<CookingRecipe> temp = (ArrayList)recipes.clone();
        for(CookingRecipe r : temp){
            for(Ingredient i : ingredients){
                if(! r.containsIngredient(i)){
                    temp.remove(r);
                    break;
                }
            }
        }
        return temp.size () > 0 ? (CookingRecipe[])temp.toArray() : null;
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
        ArrayList<CookingRecipe> temp = (ArrayList)recipes.clone();
        for(CookingRecipe r : temp){
            if(! (r.getNumberOfIngredients() <= numberOfIngredients)){
                temp.remove(r);
            }
        }
        return temp.size () > 0 ? (CookingRecipe[])temp.toArray() : null;
    }
    public CookingRecipe[] findRecipesLowCalories(){
        float lowest = Integer.MAX_VALUE;
        ArrayList<CookingRecipe> temp = new ArrayList<CookingRecipe>();
        for(CookingRecipe r : recipes){
            if(r.calculateCalories() < lowest){
                temp.clear();
                temp.add(r);
            }
            else if(r.calculateCalories() == lowest){
                temp.add(r);
            }
        }
        return temp.size () > 0 ? (CookingRecipe[])temp.toArray() : null;
    }

    private int isInRecipes(String recipeName){
        for(int i = 0; i < recipes.size(); i++){
            if(recipes.get(i).getName().equals(recipeName))
                return i;
        }
        return -1;
    }

    public String toString(){
        String output = "RecipeBook\nBook Name= " + bookName + "\nRecipes= ";
        for(int i = 0; i < recipes.size(); i++){
            output += recipes.get(i).getName();
            if(i == recipes.size()-1)
                output += ", ";
        }
        return output;
    }

    public boolean equals(Object other){
        if(other instanceof RecipeBook){
            if(bookName.equals(((RecipeBook) other).getBookName())){
                if(recipes.size() == ((RecipeBook) other).recipes.size()){
                    for(CookingRecipe r : recipes){
                        if(!((RecipeBook) other).recipes.contains(r))
                            return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
