
public class ThreadSafeSingleton {

    public ThreadSafeSingleton() {
    }

    public static class SingletonHolder {
        private final static ThreadSafeSingleton instance =
                new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
