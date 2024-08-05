public class OperasiMatematika {
    public static void main(String[] args) {
        // +, -, *, /, %
        int a = 10;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented assignment | += , -=, *=, /=, %=
        int c = 100;

        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);

        // Unary | ++, --, +, -, !
        System.out.println(a++);
        System.out.println(a--);
    }
}
