package Lab3;

/**
 * Created by cebo4 on 9/14/2017.
 */
public class Ingredient {
    private String name;
    private String measuringUnit;
    private int caloriesPerUnit;

    public Ingredient(String name, String measuringUnit, int caloriesPerUnit) {
        this.name = name;
        this.measuringUnit = measuringUnit;
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public Ingredient(Ingredient ingredient){
        name = ingredient.getName();
        measuringUnit = ingredient.getMeasuringUnit();
        caloriesPerUnit = ingredient.getCaloriesPerUnit();
    }

    public String getName() {
        return name;
    }

    public String getMeasuringUnit() {
        return measuringUnit;
    }

    public int getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public String toString(){
        return "Ingredient\n"+ "name=" + name + "\n" +"measuringUnit=" +
                measuringUnit + "\n" + "caloriesPerUnit="+ caloriesPerUnit;
    }

    public boolean equals(Object other){
        if(other instanceof Ingredient){
            if(name == ((Ingredient) other).getName() &&
                    measuringUnit == ((Ingredient) other).getMeasuringUnit()
                    && caloriesPerUnit == ((Ingredient) other).getCaloriesPerUnit()){
                return true;
            }
        }
        return false;
    }
}
