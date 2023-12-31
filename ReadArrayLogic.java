package Assignment;

public class ReadArrayLogic {

    public static int numberOfRows = 0;
    public static int numberOfCharacters = 0;
    public static int numberOfWords = 0;
    public static String longestWord = "";

    //constructor
    public ReadArrayLogic() {

    }

    //check if user has written "stop"
    public static boolean CheckLine(String myLine) {
        String line = myLine;
        if (line.equalsIgnoreCase("stop")) {
            return true;
        } else {
            return false;
        }
    }


    //counts number of lines
    public void CountLines(String myLine) {
        //count number of rows
        numberOfRows++;
    }

    //count number of characters
    public void CountCharacters(String myLine) {
        String line = myLine;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
            } else {
                numberOfCharacters++;
            }
        }
    }

    //Divides text into words and count them
    public void CountWords(String myLine) {

        String[] tempArray = myLine.split(" ");
        numberOfWords += tempArray.length;

        //comparing length of the words
        String tempWord = "";

        for (int i = 0; i < tempArray.length; i++) {
            tempWord = tempArray[i];
            if (longestWord.length() < tempWord.length()){
                longestWord = tempWord;
            }

        }

    }
}