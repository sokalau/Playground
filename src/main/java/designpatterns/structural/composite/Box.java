package designpatterns.structural.composite;

public class Box extends Leaf {
    private Color color;

    Box(double amount, Color color) {
        super(amount);
        this.color = color;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Box{" +
                "amount=" + amount +
                ", color=" + color +
                "}";
    }

    enum Color {
        RED("red"),
        GREEN("green"),
        BLUE("blue");

        private String name;

        Color(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
