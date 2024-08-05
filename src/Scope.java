public class Scope {
    public static void main(String[] args) {

    }
    static void sayHello(String name) {
        String hello = "Hello" + name;

        if(!name.isBlank()) {
            String hi = "Hi";
            System.out.println(hello); // Bisa diakses karena berada di dalam scope
        }
        System.out.println(hi); // Tidak bisa diakses karena tidak berada dalam scope
    }
}
