
class Box<T> {
    T value;

    void set(T value) {
        this.value = value;
    }

    T get() {
        return value;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        Box<String> b = new Box<>();
        b.set("Java");

        System.out.println(b.get());
    }
}
