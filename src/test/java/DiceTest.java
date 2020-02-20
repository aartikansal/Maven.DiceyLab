import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DiceTest {

@Test
    public void testPairOfDice(){

    //
    Dice  dice = new Dice ( 2);
    dice.setSeed();

    //
    Integer toss=dice.toss();
    System.out.println(toss);

    toss=dice.toss();
    System.out.println(toss);

    System.out.println(toss);
    toss=dice.toss();

    System.out.println(toss);
    toss=dice.toss();
}
public void testRoll(){

}
}