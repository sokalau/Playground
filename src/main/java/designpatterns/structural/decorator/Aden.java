package designpatterns.structural.decorator;

class Aden extends CondimentDecorator {
    private static final double COST = 0.35;
    private static final String ADEN = ", Aden";
    private Beverage beverage;

    Aden(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + ADEN;
    }

    @Override
    double cost() {
        return COST + beverage.cost();
    }
}
