public class Switch {
    public static void main(String[] args) {
        var nilai = 'A';

        switch(nilai) {
            case 'A':
                System.out.println("Awesome");
                break;
            case 'B':
            case 'C':
                System.out.println("Good");
                break;
            default:
                System.out.println("Coba lagi");
        }
        // Switch lambda
        switch(nilai) {
            case 'A' -> System.out.println("Awesome");
            case 'B', 'C' -> System.out.println("Good");
            default -> {
                System.out.println("Coba lagi");
            }
        }

        // Switch tanpa yield
        String ucapan;
        switch(nilai) {
            case 'A' -> ucapan = "Awesome";
            case 'B', 'C' -> ucapan = "Good";
            default -> {
                ucapan = "Coba lagi";
            }
        }
        System.out.println(ucapan);

        // Switch yield
        ucapan = switch(nilai) {
            case 'A':
                yield "Awesome";
            case 'B', 'C':
                yield "Good";
            default:
                yield "Coba lagi";
        };
        System.out.println(ucapan);
    }
}
