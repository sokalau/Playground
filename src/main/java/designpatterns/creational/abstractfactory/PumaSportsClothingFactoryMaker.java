package designpatterns.creational.abstractfactory;

class PumaSportsClothingFactoryMaker {
    private PumaSportsClothingFactoryMaker() {
    }

    static SportsClothingFactory makeFactory(Brand brand) {
        SportsClothingFactory factory;

        switch (brand) {
            case NIKE:
                factory = new NikeSportsClothingFactory();
                break;
            case PUMA:
                factory = new PumaSportsClothingFactory();
                break;
            default:
                throw new IllegalArgumentException("There is no such brand.");
        }

        return factory;
    }
}
