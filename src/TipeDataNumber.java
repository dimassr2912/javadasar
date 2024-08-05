public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000;
        long iniLong1 = 100000;
        long iniLong2= 100000L;

        // Floating point
        float iniFloat = 10.1010F;
        double iniDouble = 10.123456;

        // Literal
        int decimalInt = 34; // Berbasis 10
        int hexaInt = 0x123A; // Berbasis 16
        int binInt = 0b11001; // Berbasis 2

        // Underscore: Hanya sebagai pemisah agar tidak bingung saat membaca
        long balance = 1_000_000_000L;
        int sum = 4_000_000;
    }
}

/**
* Dibagi menjadi 2:
* Integer dan Floating point
* Integer: byte, short, int, long
*   Default value: 0
* Floating: float, double
*   Default value: 0.0
* */
