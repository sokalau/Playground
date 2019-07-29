package designpatterns.structural.composite;

class Sneakers extends Leaf {
    private double size;

    Sneakers(double amount, double size) {
        super(amount);
        this.size = size;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Sneakers{" +
                "amount=" + amount +
                ", size=" + size +
                "}";
    }
}
