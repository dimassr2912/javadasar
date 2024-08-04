public class TipeDataArray {
    public static void main(String[] args) {
        // Deklarasi
        String[] StringArray;
        StringArray = new String[3];

        // Inisialisasi
        String[] StringArray2 = new String[3];

        // Menambahkan data
        StringArray[0] = "Dimas";
        StringArray[1] = "Setyawan";
        StringArray[2] = "Ramadhansyah";

        // Mengambil data
        System.out.println(StringArray[0]);

        // Inisialisasi
        String[] StringArray3 = new String[] { // Isi sesuai value yang diinisialisasikan
               "Ira", "Meidiana", "Putri"
        };

        String[] StringArray4 = {
                "Ni", "Putu", "Kristiawati"
        };

        // Operasi di array
        System.out.println(StringArray.length);

        // Array dalam array
        String[][] member = new String[][] {
                {"Dimas", "Setyawan", "Ramadhansyah"},
                {"Ira", "Meidiana", "Putri"},
                {"Rama"}
        };
        System.out.println(member[2][0]);
    }
}