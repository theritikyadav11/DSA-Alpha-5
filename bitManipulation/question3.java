public class question3 {
    public static int addOne(int num) {
        int mask = 1;
        while ((num & mask) != 0) {
            num = num ^ mask;
            mask = mask << 1;
        }
        num = num ^ mask;
        return num;
    }

    public static void main(String[] args) {
        int inputNum = 7;
        int result = addOne(inputNum);
        System.out.println("Result after adding 1: " + result);
    }
}
