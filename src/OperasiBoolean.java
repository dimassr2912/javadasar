public class OperasiBoolean {
    public static void main(String[] args) {
        // &&, ||, !
        var nilaiUjian = 80;
        var nilaiAbsen = 75;

        var lulusUjian  = nilaiUjian >= 80;
        var lulusAbsen = nilaiAbsen >= 80;

        var lulusKelas = lulusUjian && lulusAbsen;
        System.out.println(lulusKelas);
    }
}
