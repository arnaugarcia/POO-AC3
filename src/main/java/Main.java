import domain.Alcohol;
import domain.Mixer;
import dto.AlcoholMixerCountDTO;
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

            // TODO: Make service as a singleton
            switch (option) {
                case 1:
                    option1(service);
                    break;
                case 2:
                    option2(service);
                    break;
                case 3:
                    option3(service);
                    break;
                case 4:
                    option4(service);
                    break;
                case 5:
                    option5(service);
                    break;
                default:
                    System.out.println("Option not valid or not implemented yet");
            }

        } while (option != MENU_EXIT);

    }

    private static void option5(ServiceData service) {
        service.findTopMixersByAverageAlcoholGraduation(3);
    }

    private static void option4(ServiceData service) {
        List<AlcoholMixerCountDTO> top3Alcohols = service.findTopAlcoholCombinations(3);
        top3Alcohols.forEach(System.out::println);
    }

    private static void option3(ServiceData service) {
        final Alcohol result = service.findTopAlcoholByFoundersNameLengthSum("Gin");
        System.out.println(result);
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
