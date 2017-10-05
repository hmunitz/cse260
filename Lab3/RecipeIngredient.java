package Lab3;

/**
 * Created by cebo4 on 9/14/2017.
 */
public class RecipeIngredient extends Ingredient {
    private float quantity;

    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity) {
        super(name, measuringUnit, caloriesPerUnit);
        this.quantity = quantity;
    }

    public RecipeIngredient(Ingredient ingredient, float quantity) {
        super(ingredient);
        this.quantity = quantity;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantity=" + quantity;
    }
}
