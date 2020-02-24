import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import static org.junit.Assert.*;

public class SimulationTest {

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 100000);
        sim.runSimulation();
        sim.printResults();
    }
}
