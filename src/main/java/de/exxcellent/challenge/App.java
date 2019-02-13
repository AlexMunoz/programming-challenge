package de.exxcellent.challenge;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * 
     * @param args The CLI arguments passed
     * @throws FileNotFoundException
     */
    public static void main(String... args) {

        // Your preparation code …

        CSVReader r = new CSVReader("src/main/resources/de/exxcellent/challenge/weather.csv");
        ArrayList<Weather> list = r.read();
        list.sort((Weather A, Weather B) -> A.getMxT() - A.getMnT() < B.getMxT() - B.getMnT() ? -1 : 1);

        String dayWithSmallestTempSpread = list.get(0).getDay(); // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
