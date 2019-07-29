package designpatterns.creational.prototype;

interface Athlete extends Cloneable {
    Athlete clone() throws CloneNotSupportedException;
}
