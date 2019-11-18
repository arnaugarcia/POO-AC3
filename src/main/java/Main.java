import domain.Alcohol;
import domain.Mixer;
import service.ServiceData;

import java.util.List;
import java.util.Scanner;

import static cli.Menu.MENU_EXIT;
import static cli.Menu.showMenu;

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
                    option1(service);
                    break;
                case 2:
                    option2(service);
                    break;
                default:
                    System.out.println("Option not valid or not implemented yet");
            }

        } while (option != MENU_EXIT);

    }

    private static void option2(ServiceData service) {
        Mixer cola = service.findMixerByName("Cola");
        List<Alcohol> alcohols = service.findByGraduationBetweenAndCombineWith(25, 60, cola);
        System.out.println(alcohols);
    }

    private static void option1(ServiceData service) {
        service.findAllTypes().forEach(type -> {
            List<Alcohol> alcohols = service.findAlcoholByType(type);
            System.out.println("Type " + type.getName() + " has " + alcohols.size() + " drinks.");
        });
    }
}
