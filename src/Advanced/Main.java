package Advanced;

class Singleton {
    public String str;

    private Singleton() {
    }

    static Main getSingleInstance() {
        return new Main();
    }
}

public class Main {
    public static void main(String[] args) {
        Main singleton = Singleton.getSingleInstance();
    }
}

