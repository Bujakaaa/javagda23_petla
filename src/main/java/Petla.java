import java.util.Scanner;

public class Petla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres (0-n)");
        int liczba = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < liczba ; i++) {
            System.out.println(i);
        }
    }
}
