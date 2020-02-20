import java.util.Random;

public class Dice {

       private int dice1;
       private int dice2;
       private int numberOfDice;
       private Random rgen;

      public Dice (int numberOfDice) {
          this.numberOfDice = numberOfDice;
          rgen= new Random();
      }
         public Integer toss() {
          dice1 = (int) (rgen.nextInt(6) + 1);
          dice2 = (int) (rgen.nextInt( 6) + 1);
           return dice1 + dice2;

      }

public void setSeed(){
          this.rgen.setSeed(17L);
}
}