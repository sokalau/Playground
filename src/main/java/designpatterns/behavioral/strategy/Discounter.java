package designpatterns.behavioral.strategy;

@FunctionalInterface
interface Discounter {
    double calculateDiscount(double amount);
}
