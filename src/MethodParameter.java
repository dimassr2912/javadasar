public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Dimas", "Ramadhansyah");
    }

    static void sayHello(String firstName, String lastName) {
        String fullName = firstName+  " " + lastName;
        System.out.println(fullName);
    }
}
