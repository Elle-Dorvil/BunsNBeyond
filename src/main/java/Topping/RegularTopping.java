package Topping;

public abstract class RegularTopping {
    private String type;

    public RegularTopping(String type) {
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


