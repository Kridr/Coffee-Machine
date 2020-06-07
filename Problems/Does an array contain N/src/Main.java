import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
           array[i] = scanner.nextInt();
        }

        int goalValue = scanner.nextInt();
        boolean attend = false;

        for (int i = 0; i < len && !attend; i++) {
            if (array[i] == goalValue) {
                attend = true;
            }
        }

        System.out.println(attend);
    }
}