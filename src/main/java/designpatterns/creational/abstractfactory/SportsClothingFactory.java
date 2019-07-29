package designpatterns.creational.abstractfactory;

abstract class SportsClothingFactory {
    SportsClothingFactory() {
    }

    abstract Trousers makeTrousers();

    abstract LongSleeve makeLongSleeve();
}
