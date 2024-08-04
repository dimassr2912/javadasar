public class KonversiNumber {
    public static void main(String[] args) {
        // Widening casting
        byte iniByte = 100;
        short iniShort = iniByte;

        // Narrowing casting
        int iniInt2 = 100;
        byte iniByte2 = (byte) iniInt2;

    }
}

/*
* Widening casting (otomatis) : byte -> short -> int -> long -> float -> double
* Narrowing casting (manual) : double -> float -> long -> int -> short -> byte */

