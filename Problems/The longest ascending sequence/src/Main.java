import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }

        int longestSeq = 0;

        for (int i = 0; i < len; i++) {
            int localLongestSeq = 1;
            for (int j = i; j < len - 1; j++) {
                if (array[j] < array[j + 1]) {
                    localLongestSeq++;
                } else {
                    break;
                }
            }

            if (localLongestSeq > longestSeq) {
                longestSeq = localLongestSeq;
            }
        }

        System.out.println(longestSeq);
    }
}