
@FunctionalInterface
interface Message {
    void show();
}

public class FunctionalExample {
    public static void main(String[] args) {
        Message m = () -> System.out.println("Hello Java");
        m.show();
    }
}
