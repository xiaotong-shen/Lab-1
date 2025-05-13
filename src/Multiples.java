public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i < 1000; i++) {
            if (FizzBuzz.fizzbuzzBool(i)) {
                j++;
            }
        }
        System.out.println(j);
    }
}
