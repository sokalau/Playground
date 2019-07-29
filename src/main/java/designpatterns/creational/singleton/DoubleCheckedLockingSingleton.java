package designpatterns.creational.singleton;

class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    public static DoubleCheckedLockingSingleton getInstance() {
        DoubleCheckedLockingSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    localInstance = instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return localInstance;
    }
}