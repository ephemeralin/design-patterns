package gof.creational.factory_method;

public abstract class Pizza {

    protected String name;
    protected String ingredients;
    protected boolean baked;

    @Override
    public String toString() {
        return (baked ? "Baked " : "Raw ") + name +
                ((ingredients == null || ingredients.equals("")) ? "" : " with ") + ingredients;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public boolean isBaked() {
        return baked;
    }
}
