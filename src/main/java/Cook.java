public class Cook {

  private   String dish = "peperonny pizza";

private int quantity = 0;

public void addMoreDish(){
    ++this.quantity;
}

    public void discardOneDish(){
        --this.quantity ;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
