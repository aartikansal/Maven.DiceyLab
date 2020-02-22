import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DiceTest {

@Test
    public void testPairOfDice(){

    //
    Dice  dice = new Dice ( 2);
    dice.setSeed();

    int expected = 2;
    int actual = dice.toss();
    assertEquals(actual,expected);





}
}