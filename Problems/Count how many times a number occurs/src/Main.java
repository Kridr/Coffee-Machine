import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        int count = 0;
        for (var elem : array) {
            if (elem == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}