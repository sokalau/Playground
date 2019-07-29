package designpatterns.structural.composite;

abstract class Leaf implements Component {
    double amount;

    Leaf(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }
}
