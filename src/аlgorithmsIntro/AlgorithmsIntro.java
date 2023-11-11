package аlgorithmsIntro;
import java.util.Scanner;
public class AlgorithmsIntro {

private static double price[];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ціну на каждый день недели");
        System.out.println("--------------------------");

        String[] дніТижня = {"пн", "вт", "ср", "чт", "пт", "сб", "неділя"};
        double[] ціни = new double[7];

        for (int i = 0; i < 7; i++) {
            boolean введено = false;
            while (!введено){
                System.out.println(дніТижня[i] + ": ");
                if (scanner.hasNextDouble()) {
                    ціни[i] = scanner.nextDouble();
                    введено = true;

                }else {
                    System.out.println("Некоректно введина ціна, введіть корекну ціну");
                    scanner.next();

                }
            }
        }

        double total = calculateTotal(ціни);
        System.out.println("Загальна сумма: " + total);

        for (int i = 0; i < ціни.length; i++) {
            for (int j = 1; j < (ціни.length - i); j++) {
                if (ціни[j - 1] > ціни[j]) {
                    // Перестановка елементів
                    double temp = ціни[j - 1];
                    ціни[j - 1] = ціни[j];
                    ціни[j] = temp;
                }
            }
        }

        System.out.println("Сортирування:");
        for (double number : ціни)
            System.out.print(number + " ");
    }

    public static double calculateTotal(double[] ціни) {
        double total = 0;
        for (double ціна : ціни) {
            total += ціна;
        }
        return total;



    }

}






