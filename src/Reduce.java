public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int n = 1000;

        while (n > 0) {
            reduce(n);
            count += 1;
        }

        System.out.println(count);

    }
    public static void reduce(int n) {

        if (n % 2 == 0) {
            n = n / 2;
        }
        else {
            n--;
        }

    }
}
