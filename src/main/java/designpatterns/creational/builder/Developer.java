package designpatterns.creational.builder;

class Developer {
    private final DeveloperLevel developerLevel;
    private final boolean liableForMilitaryService;
    private final int age;
    private final double experience;
    private final String name;

    private Developer(Builder builder) {
        this.developerLevel = builder.developerLevel;
        this.liableForMilitaryService = builder.liableForMilitaryService;
        this.age = builder.age;
        this.experience = builder.experience;
        this.name = builder.name;
    }

    static class Builder {
        private final DeveloperLevel developerLevel;
        private final boolean liableForMilitaryService;
        private double experience;
        private int age;
        private String name;

        Builder(DeveloperLevel developerLevel, boolean liableForMilitaryService) {
            if (developerLevel == null) {
                throw new IllegalArgumentException("Developer level can't be null");
            }
            this.developerLevel = developerLevel;
            this.liableForMilitaryService = liableForMilitaryService;
        }

        Builder age(int age) {
            this.age = age;
            return this;
        }

        Builder experience(double experience) {
            this.experience = experience;
            return this;
        }

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Developer build() {
            return new Developer(this);
        }
    }

    @Override
    public String toString() {
        return "Developer{" +
                "developerLevel=" + developerLevel +
                ", liableForMilitaryService=" + liableForMilitaryService +
                ", age=" + age +
                ", experience=" + experience +
                ", name=" + name +
                "}";
    }
}
