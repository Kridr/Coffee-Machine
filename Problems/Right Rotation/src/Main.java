import java.util.Scanner;

class Main {
    public static String[] rightShift(String[] mas) {
        String[] tempMas = new String[mas.length];

        System.arraycopy(mas, 0, tempMas, 1, mas.length - 1);

        tempMas[0] = mas[mas.length - 1];
        return tempMas;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().trim().split(" ");

        int numberOfRotations = scanner.nextInt();

        numberOfRotations %= arr.length;

        for (int i = 0; i < numberOfRotations; i++) {
            arr = rightShift(arr);
        }

        for (var elem : arr) {
            System.out.print(elem + " ");
        }



    }
}