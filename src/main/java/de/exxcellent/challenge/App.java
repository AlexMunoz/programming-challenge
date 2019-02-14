package de.exxcellent.challenge;

import java.util.ArrayList;
import java.util.Collections;

import de.exxcellent.challenge.io.CSVReader;
import de.exxcellent.challenge.model.Football;
import de.exxcellent.challenge.model.Weather;
import de.exxcellent.challenge.util.FootballCSVAdapter;
import de.exxcellent.challenge.util.SortFootballBySmallAbsGoalDiff;
import de.exxcellent.challenge.util.SortWeatherBySmallTempDiff;
import de.exxcellent.challenge.util.WeatherCSVAdapter;

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
     */
    public static void main(String... args) {

        // Your preparation code …
        CSVReader r1 = new CSVReader("src/main/resources/de/exxcellent/challenge/weather.csv");
        WeatherCSVAdapter a1 = new WeatherCSVAdapter(r1);

        ArrayList<Weather> weathers = a1.read();

        Collections.sort(weathers, new SortWeatherBySmallTempDiff());
        Weather w = weathers.get(0);

        CSVReader r2 = new CSVReader("src/main/resources/de/exxcellent/challenge/football.csv");
        FootballCSVAdapter a2 = new FootballCSVAdapter(r2);

        ArrayList<Football> teams = a2.read();

        Collections.sort(teams, new SortFootballBySmallAbsGoalDiff());
        Football f = teams.get(0);

        String dayWithSmallestTempSpread = w.getDay(); // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = f.getTeamName(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
