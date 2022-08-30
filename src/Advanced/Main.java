package Advanced;

class Singleton {
    public String str;

    private Singleton() {
    }

    static Singleton getSingleInstance() {
        return new Singleton();
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
    }
}

