package Sandwich;

public class Sandwich {
    private String bread;
    private int size;
    private boolean isToasted;
    private boolean extraMeat;
    private boolean extraCheese;

    public Sandwich(String bread, int size, boolean isToasted, boolean extraMeat, boolean extraCheese) {
        this.bread = bread;
        this.size = size;
        this.isToasted = isToasted;
        this.extraMeat = extraMeat;
        this.extraCheese = extraCheese;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }
}
