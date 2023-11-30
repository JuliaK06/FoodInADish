package bg.smg;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;

    public FoodInADish() {
        this.food = null;
        this.dishColor = "";
    }
    public FoodInADish(int xCoord, int yCoord, int width, int height, T food, String dishColor) {
        super(xCoord, yCoord, width, height);
        this.food = food;
        this.dishColor = dishColor;
    }

    @Override
    public double CompareTo(Fruit f){


    }
    @Override
    public void draw() {

    }


    @Override
    public String toString() {
        return "A" + food +
                "in a'" + dishColor  +
                "dish";
    }

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishColor() {
        return dishColor;
    }

    public void setDishColor(String dishColor) {
        this.dishColor = dishColor;
    }

    @Override
    public int compareTo(FoodInADish o) {
        return 0;
    }
}
