import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean alphabeticalOrder = true;

        String elem = scanner.next();

        while (scanner.hasNext() && alphabeticalOrder) {
            String nextElem = scanner.next();

            if (elem.compareTo(nextElem) > 0) {
                alphabeticalOrder = false;
            }

            elem = nextElem;
        }

        System.out.println(alphabeticalOrder);
    }
}