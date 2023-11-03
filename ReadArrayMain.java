package Assignment;

import java.util.Scanner;

import static Assignment.ReadArrayLogic.CheckLine;

public class ReadArrayMain {
    public static void main(String[] args) {

        //Skriv ett program som läser in text ifrån kommandoraden rad för rad tills användaren
        //skriver ordet stop. När användaren är klar skriver programmet utantal tecken och hur
        // många rader som användaren har skrivit, exklusive raden med ordet stop.

        //VG: Skriv ut antal ord (separerade med blanksteg)
        //Skriv ut det längsta ordet
        //Kontrollen om användaren har skrivit ordet stop eller inte måste ligga i den andra ”logik-klassen”.

        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        String line = " ";

        System.out.println("Skriv in din text här: ");
        ReadArrayLogic array = new ReadArrayLogic();

        while (!stop) {

            line = scan.nextLine();

            if (CheckLine(line)) {   //kotrollerar om stop
                break;
            } else {                //skriv ut information från logik-klassen
                array.CountLines(line);
                array.CountCharacters(line);
                array.CountWords(line);
            }

        }

        System.out.println("Antal rader: " + ReadArrayLogic.numberOfRows);
        System.out.println("Antal tecken, mellanslag ej räknade: " + ReadArrayLogic.numberOfCharacters);
        System.out.println("Antal ord: " + ReadArrayLogic.numberOfWords);
        System.out.println("Det längsta ordet är: " + ReadArrayLogic.longestWord);
    }


}
