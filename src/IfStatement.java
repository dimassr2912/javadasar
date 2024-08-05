public class IfStatement {
    public static void main(String[] args) {
        var nilaiUjian = 75;
        var nilaiAbsen = 75;

        if(nilaiUjian > 80 && nilaiAbsen > 80) {
            System.out.println("Anda lulus");
        } else if (nilaiAbsen > 70) {
            System.out.println("Perlu remedial");
        } else {
            System.out.println("Tidak lulus");
        }
    }
}
