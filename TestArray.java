package Assignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArray {


    @Test
    public void testCountLines() {
        //test counting number of lines
        //Arrange
        String myLine = "Jag skriver.";
        int expected = 4;
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        for (int i = 0; i < 4; i++) {       //writing the same line 4 times
            array.CountLines(myLine);
        }
        int actual = ReadArrayLogic.numberOfRows;

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testCountCharacters() {
        //Test counting of characters (blanks excluded) when writing more than one line.

        //Arrange
        String myLine = "Nu skriver jag";
        int expected = 48;
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        for (int i = 0; i < 4; i++) {      //writing the same line 4 times
            array.CountCharacters(myLine);
        }
        int actual = ReadArrayLogic.numberOfCharacters;

        //Assert
        assertEquals(expected, actual);
    }



    @Test
    public void testLongestWord() {
        //test selecting the longest word in two lines of text

        //Arrange
        String expected = "skriver";
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        //Submits two lines of text
        String myLine = "Jag skriver 4 ord.";
        array.CountWords(myLine);

        myLine = "Jag skrev 4 ord.";
        array.CountWords(myLine);

        String actual = ReadArrayLogic.longestWord;

        //Assert

        assertEquals(expected, actual);


    }
}