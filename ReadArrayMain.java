package Assignment;

import java.util.Scanner;

import static Assignment.ReadArrayLogic.CheckLine;

public class ReadArrayMain {
    public static void main(String[] args) {
//läser in text och skriver utresultatet till användaren
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        String line = " ";

        System.out.println("Skriv in din text här: ");

        //while (stop.equals(" ")){
        while (stop == false){

            line = scan.nextLine();

            //anropar construktorn
            ReadArrayLogic array = new ReadArrayLogic();

            //kotrollerar om stop
            if (CheckLine(line)){
                break;
            }else{
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
