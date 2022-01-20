import junit.framework.AssertionFailedError;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test {
    // input = generation
    // output = next generation

    // Inductive approach: start with the simplest generation
    // Start with the simplest data possible
    // Empty universe

    // Deductive approach: start with a clear structure generation to determine the rules
    // Define the simplest structure that has business value and then continue with more complex structures
    // Specification by Example - Gojko Adzic
    // Block 2x2 block of cells
    // L block
    // Vertical line of 3 cells

    @org.junit.Test
    public void emptyUniverseIsEmpty(){
        String emptyUniverse = "";
        assertEquals(emptyUniverse, emptyUniverse);
    }

    // I don't care about representation, I care about behavior

    @org.junit.Test
    public void universeWithOneCellIsEmpty(){
        String universeWithOneCell = "universe with one cell";
        String emptyUniverse = "";

        String expected = emptyUniverse;
        String actual = universeWithOneCell == universeWithOneCell ? emptyUniverse : emptyUniverse;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void universeWithTwoCellsIsEmpty(){
        String universeWithTwoCells = "universe with two cells";
        String emptyUniverse = "";
        String expected = emptyUniverse;
        String actual = universeWithTwoCells == universeWithTwoCells ? emptyUniverse : emptyUniverse;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void universeWithThreeCellsThatArentNeighboursIsEmpty(){
        String universeWithTwoCells = "universe with two cells";
        String emptyUniverse = "";
        String expected = emptyUniverse;
        String actual = "";
        assertEquals(expected, actual);
    }



    // Too far away
    @org.junit.Test
    public void aLivingCellShouldDieForNextGeneration(){
        String emptyUniverse = "";
        String livingCell = "living cell";
        String nextNeneration = livingCell == livingCell ? emptyUniverse : emptyUniverse;
        String input = nextNeneration;
        assertEquals(input, emptyUniverse);
    }


    // is-a
    // Universe is a grid


    // has-a
    // Grid has a cell

}
