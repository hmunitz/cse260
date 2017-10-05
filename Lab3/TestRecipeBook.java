package Lab3;

/**
 * Created by cebo4 on 9/14/2017.
 */
public class TestRecipeBook {

    public static void main(String[] args){
        RecipeIngredient ingredient1 = new RecipeIngredient("ingredient1", "Cups", 10, 4);
        RecipeIngredient ingredient2 = new RecipeIngredient("ingredient2", "Tsp", 53, 2.5f);
        RecipeIngredient ingredient3 = new RecipeIngredient("ingredient3", "Packs", 12, 1);
        RecipeIngredient ingredient4 = new RecipeIngredient("ingredient4", "Grams", 106, 73.4f);
        RecipeBook book1 = new RecipeBook("Book1");
        RecipeBook book2 = new RecipeBook("Book2");
        CookingRecipe recipe1 = new CookingRecipe("Recipe1");
        CookingRecipe recipe2 = new CookingRecipe("Recipe2");

    }
}
