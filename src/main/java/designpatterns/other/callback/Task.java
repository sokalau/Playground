package designpatterns.other.callback;

interface Task {
    void execute();

    default void executeWith(Callback callback) {
        execute();
        if (callback != null) {
            callback.call();
        }
    }
}
