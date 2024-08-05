public class ForEach {
    public static void main(String[] args) {
        int[] iniArray = new int[] {
                5, 4, 3, 2, 1
        };

        // For
        for (int i = 0; i < iniArray.length; i++) {
            System.out.println(iniArray[i]);
        }

        // For each
        for (var value : iniArray) {
            System.out.println(value);
        }
    }
}
