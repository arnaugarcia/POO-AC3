package cli;

public class Menu {

    public final static int MENU_EXIT = 6;

    public static void showMenu() {
        System.out.println(
                "1. Calcular quantes begudes alcoholiques hi ha de cada tipus.\n" +
                "2. Mostrar una llista de les begudes destilades (25-60) que es poden barrejar amb cola.\n" +
                "3. Mostrar tota la informacio de la ginebra on la suma de la mida del nom dels seus fundadors sigui major.\n" +
                "4. Mostrar un top 3 de les combinacions (alcohol + mixer) mes repetides.\n" +
                "5. Mostrar un top 3 dels mixers on la mitjana dels graus de les begudes amb les que es barregen sigui major.\n" +
                "6. Sortir.");

        System.out.println("Selecciona una opcio:");
    }

}
