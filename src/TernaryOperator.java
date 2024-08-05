public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        if (nilai>= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }

        // Ternary operator
        ucapan = nilai >= 70 ? "Lulus" : "Tidak lulus";
        System.out.println(ucapan);
    }
}
