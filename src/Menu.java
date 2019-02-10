import java.util.Scanner;

public class Menu {

    public void startmenu(){

        Taxi taxi = new Taxi();
        Pris pris = new Pris();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Damn Fast Taxis\n" +
                "(1) Start a taxi\n" +
                "(2) Stop a taxi\n" +
                "(3) Pause a ride\n" +
                "(4) Ask for price\n" +
                "(5) Free ride\n" +
                "Choose a <number> and hit “enter”:");


        //switch case til at sende bruger videre til ønsket platform i programmet

        int in = scanner.nextInt();
        switch (in){

            case 1: taxi.startTaxi();
            break;
            case 2: taxi.stopTaxi();
            break;
            case 3: taxi.pauseTaxi();
            break;
            case 4: pris.priser();
            break;
            case 5: taxi.gratisTaxi();
            break;
            default: System.out.println("Vi forstår ikke dit ønske. Prøv venlgist igen"); //Hvis brugeren trykker et invalidt nummer ind, vil startMenu starte forfra igen
                startmenu();
            break;
        }


    }
}
