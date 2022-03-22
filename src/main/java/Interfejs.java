import java.util.Scanner;

public class Interfejs {

    static Scanner scanner = new Scanner(System.in);

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.println("Podaj imie kota: ");
        kot.setImie(getUserInput());

        System.out.println("Podaj imie opiekuna: ");
        kot.setImieOpiekuna(getUserInput());

        System.out.println("Dziekuje za podanie odpowiednich danych");
    }
}
