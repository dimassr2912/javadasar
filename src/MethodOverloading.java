public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Rama");
        sayHello("Dimas", "Setyawan");
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
/**
* Method overloading: Membuat method dengan nama yang sama
* Syaratnya: Paramater harus berbeda*/