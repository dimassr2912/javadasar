public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] mahasiswa = new int[] {
                1, 2, 3, 4, 5
        };

        var nilaiKelas = sum(mahasiswa);
        System.out.println(nilaiKelas);

        // Variable argument
        var nilaiAvg = avg(mahasiswa);
        System.out.println(nilaiAvg);

        var nilaiAvg2 = avg(1, 2, 3, 4, 5);
        System.out.println(nilaiAvg2);
    }

    // tanpa variable argument
    static int sum(int[] mhs) {
        int total = 0;

        for (var result : mhs) {
            total += result;
        }
        return total;
    }

    // variable argument
    static int avg(int... mhs) {
        int total = 0;

        for (var result : mhs) {
            total += result;
        }
        return total / mhs.length;
    }
}
