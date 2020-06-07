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
        int m = scanner.nextInt();

        boolean next = false;
        for (int i = 0; i < len - 1 && !next; i++) {
            if (array[i] == m && array[i + 1] == n || array[i] == n && array[i + 1] == m) {
                next = true;
            }
        }

        System.out.println(!next);
    }
}