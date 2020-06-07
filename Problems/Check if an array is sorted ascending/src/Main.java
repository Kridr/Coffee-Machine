import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        boolean ordered = true;

        for (int i = 0; i < len - 1 && ordered; i++) {
            if (array[i] > array[i + 1]) {
                ordered = false;
            }
        }

        System.out.println(ordered);
    }
}