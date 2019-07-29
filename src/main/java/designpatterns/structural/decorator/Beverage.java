package designpatterns.structural.decorator;

abstract class Beverage {
    String description = "Unknown Beverage";

    String getDescription() {
        return description;
    }

    abstract double cost();
}
