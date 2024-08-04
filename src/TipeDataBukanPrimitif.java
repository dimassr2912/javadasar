public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;
        Boolean initBoolean = true;

        Short iniShort; // null
        iniShort = 10;
        System.out.println(iniShort);

        // Konversi primtif ke object
        byte iniByte= 100;
        Byte byteObject = iniByte;

        // Konversi primitif ke object tipe data lain
        short shortObject = byteObject.shortValue();

    }
}
/*
* Tipe data primitif: number, boolean, char,
* Tipe data primitif memiliki default value
* Tipe data tidak primitif / object tidak memiliki default value, tetapi bernilai null
* Tipe data primitif memiliki method / function
* Tipe data primitif memiliki representasi data tidak primitif
* Byte, Short, Integer, Long, Float, Double, Character, Boolean
* */
