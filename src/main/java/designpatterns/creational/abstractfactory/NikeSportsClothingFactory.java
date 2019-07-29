package designpatterns.creational.abstractfactory;

class NikeSportsClothingFactory extends SportsClothingFactory {
    NikeSportsClothingFactory() {
    }

    @Override
    Trousers makeTrousers() {
        return new NikeTrousers();
    }

    @Override
    LongSleeve makeLongSleeve() {
        return new NikeLongSleeve();
    }
}
