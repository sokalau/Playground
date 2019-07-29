package designpatterns.structural.decorator;

class Mocha extends CondimentDecorator {
    private static final double COST = 0.20;
    private static final String MOCHA = ", Mocha";
    private Beverage beverage;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    String getDescription() {
        return beverage.getDescription() + MOCHA;
    }

    @Override
    double cost() {
        return COST + beverage.cost();
    }
}
