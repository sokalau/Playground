package designpatterns.structural.decorator;

class Espresso extends Beverage {
    private static final double COST = 1.99;

    Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return COST;
    }
}
