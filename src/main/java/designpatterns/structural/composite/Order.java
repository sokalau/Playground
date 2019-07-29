package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Order implements Component {
    private List<Component> components = new ArrayList<>();

    void add(Component component) {
        components.add(component);
    }

    void remove(Component component) {
        components.remove(component);
    }

    @Override
    public double getAmount() {
        double amount = 0;

        for (Component component : components) {
            amount += component.getAmount();
        }

        return amount;
    }
}
