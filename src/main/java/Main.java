public class Main {

    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.addMoreDish();
        System.out.printf("You are in free mode. And we cook for you %s of %s", cook.getQuantity(), cook.getDish());
    }

}
