import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }

        System.out.println(min);
    }
}