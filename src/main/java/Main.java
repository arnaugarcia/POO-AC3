import domain.Data;
import exceptions.DataException;
import service.ServiceData;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ServiceData service = new ServiceData();

        final Data data = service.findAll()
                .orElseThrow(DataException::new);

        int option;

        do {
            Scanner in = new Scanner(System.in);
            option = in.nextInt();

            System.out.println("Show menu");

        } while (option != 5);

    }
}
