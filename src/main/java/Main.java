import java.util.Scanner;

import static cli.Menu.showMenu;

public class Main {

    public static void main(String[] args) {

        int option;

        showMenu();

        do {
            Scanner in = new Scanner(System.in);
            option = in.nextInt();

        } while (option != 6);

    }
}
