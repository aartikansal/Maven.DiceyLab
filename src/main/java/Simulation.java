import java.util.HashMap;

public class Simulation {
    private Integer numOfDie;
    private Integer numOfTosses;
    private Bins bin;
    private Dice dice;

    public Simulation() {
    }

    public Simulation(Integer numOfDie, Integer numOfTosses) {
        this.numOfDie = numOfDie;
        this.numOfTosses = numOfTosses;
        this.bin = new Bins(numOfDie);
        this.dice = new Dice(numOfDie);
    }

    public void runSimulation() {
        Integer sum = 0;
        for (int i = 0; i < numOfTosses; i++) {
            sum = dice.toss();
            bin.incrementBin(sum);
        }
    }

    public void printResults() {
        HashMap<Integer, Integer> results = bin.getB();
        Float percent;
        for (Integer keySum : results.keySet()) {
            percent = calcPercent(bin.getBin(keySum), numOfTosses); // bin.getBin(keySum) is tallyOfToss
            int rowOfStars;
            rowOfStars = 0b1;
            System.out.println(keySum + "  :   " + Math.round(bin.getBin(keySum)) + " :   " + Math.round(percent)+ "   "+printStars(rowOfStars));
        }

    }

    public Float calcPercent(Integer tallyOfToss, Integer numOfTosses) {
        Float percentValue = (float) tallyOfToss / numOfTosses*100;
        return percentValue;
    }

    public String printStars(Integer numOfStars) {
        String rowOfStars = "";
        for (int i = 0; i < numOfStars; i++) {
            rowOfStars += "*";
        }
        return rowOfStars;
    }
}



