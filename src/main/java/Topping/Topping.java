package Topping;

public abstract class Topping {
    private String type;

    public Topping(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double abstract getPrice(int size);
}


