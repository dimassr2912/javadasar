public class Perulangan {
    public static void main(String[] args) {
        // For
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello World-" + i);
        }

        // While
        int i = 1;
        while (i <= 10) {
            System.out.println("Hello World-" + i);
            i++;
        }

        // do while
        do {
            System.out.println("Hello World-" + i);
            i++;
        } while(i < 10);
    }
}
