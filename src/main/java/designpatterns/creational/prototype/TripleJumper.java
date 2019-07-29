package designpatterns.creational.prototype;

import java.util.Objects;

class TripleJumper implements Athlete {
    private double personalBest;

    TripleJumper(double personalBest) {
        this.personalBest = personalBest;
    }

    @Override
    public Athlete clone() throws CloneNotSupportedException {
        return (Athlete) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripleJumper that = (TripleJumper) o;
        return Objects.equals(this.personalBest, that.personalBest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalBest);
    }

    @Override
    public String toString() {
        return "Triple jumper object";
    }
}
