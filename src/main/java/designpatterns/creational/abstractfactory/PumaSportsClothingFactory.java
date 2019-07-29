package designpatterns.creational.abstractfactory;

class PumaSportsClothingFactory extends SportsClothingFactory {
    PumaSportsClothingFactory() {
    }

    @Override
    Trousers makeTrousers() {
        return new PumaTrousers();
    }

    @Override
    LongSleeve makeLongSleeve() {
        return new PumaLongSleeve();
    }
}
