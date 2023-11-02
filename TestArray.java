package Assignment;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArray {


    @Test
    public void testCountLines() {
        //Arrange
        String myLine = "Jag skriver 4 ord.";
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
        //Arrange
        String myLine = "Jag skriver 4 ord.";
        int expected = 4;
        ReadArrayLogic array = new ReadArrayLogic();

        //Act
        array.CountWords(myLine);
        int actual = ReadArrayLogic.numberOfWords;

        //Assert

        assertEquals(expected, actual);


    }
}