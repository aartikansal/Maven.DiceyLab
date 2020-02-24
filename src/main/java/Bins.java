import java.util.HashMap;

public class Bins {
    private HashMap<Integer, Integer> B = new HashMap<>();

    public Bins(Integer numberOfDice) {
        for (int i = 2; i <= numberOfDice * 6; i++) {
            B.put(i, 0);
        }
    }

    public void incrementBin(Integer inc) {
        B.put(inc, B.get(inc) + 1);
    }

    public Integer getBin(Integer binNumber) {
        return B.get(binNumber);
    }


    public HashMap<Integer, Integer> getB() {
        return B;
    }
}


