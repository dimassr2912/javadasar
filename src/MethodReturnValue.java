public class MethodReturnValue {
    public static void main(String[] args) {
        var total = sum(2, 5);
        System.out.println(total);
    }

    static int sum(int value1, int value2) {
        var result = value1 + value2;
        return result;
    };
}
/**
* Hanya bisa return 1 data*/