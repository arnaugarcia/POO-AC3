import domain.Alcohol;
import domain.Mixer;
import service.ServiceData;

import java.util.List;
import java.util.Scanner;

import static cli.Menu.*;

public class Main {

    public static void main(String[] args) {

        ServiceData service = new ServiceData();

        int option;

        do {
            showMenu();
            Scanner in = new Scanner(System.in);
            option = in.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    Mixer cola = service.findMixerByName("Cola");
                    List<Alcohol> alcohols = service.findByGraduationBetweenAndCombineWith(25 , 60, cola);
                    System.out.println(alcohols);
                    break;
                default:
                    System.out.println("Option not valid");
            }

        } while (option != MENU_EXIT);

    }
}
