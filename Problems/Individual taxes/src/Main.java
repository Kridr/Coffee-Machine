import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompanies = scanner.nextInt();

        double[] incomes = new double[numberOfCompanies];
        double[] taxes = new double[numberOfCompanies];

        for (int i = 0; i < numberOfCompanies; i++) {
            incomes[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            taxes[i] = scanner.nextDouble();
        }

        double maxTax = 0;
        int indexOfMaxTax = 0;
        for (int i = 0; i < numberOfCompanies; i++) {
            double tempTax = incomes[i] * taxes[i] / 100;
            if (tempTax > maxTax) {
                maxTax = tempTax;
                indexOfMaxTax = i;
            }
        }

        System.out.println(indexOfMaxTax + 1);

    }
}