package Topping;

public abstract class Topping {
    protected String name;

    public Topping(String name) {
        this.name = name;
    }

    public abstract String getType();

    public abstract double getPrice(int size);

    public String getName() {
        return name;
    }
}

//    public abstract double getPrice(int size);
//
//}


