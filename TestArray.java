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
        for (int i = 0; i < 4; i++) {
            array.CountLines(myLine);
        }
        int actual = ReadArrayLogic.numberOfRows;

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testCountCharacters() {
        //Test correct counting of characters, blanks excluded, when writing more than one line.

        //Arrange
        String myLine = "Nu skriver jag";
        int expected = 48;
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        for (int i = 0; i < 4; i++) {
            array.CountCharacters(myLine);
        }
        int actual = ReadArrayLogic.numberOfCharacters;

        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testCountWords() {
        //test counting of words on two lines
        //Arrange
        String myLine = "Jag skriver 4 ord.";
        int expected = 8;
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        array.CountWords(myLine);
        array.CountWords(myLine);
        int actual = ReadArrayLogic.numberOfWords;

        //Assert

        assertEquals(expected, actual);


    }
    @Test
    public void testLongestWord() {
        //test counting of words on two lines
        //Arrange
        //String myLine = "Jag skriver 4 jätttelånga  ord.";
        String expected = "skriver";
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        //array.CountWords(myLine);
        String myLine = "Jag skriver 4 ord.";
        array.CountWords(myLine);
        myLine = "Jag skrev 4 ord.";
        array.CountWords(myLine);
        String actual = ReadArrayLogic.longestWord;

        //Assert

        assertEquals(expected, actual);


    }
}