package de.exxcellent.challenge.util;

import java.util.ArrayList;

import de.exxcellent.challenge.io.IReader;
import de.exxcellent.challenge.model.Football;

/**
 * FootballCSVAdapter
 */
public class FootballCSVAdapter extends AbstractAdapter<Football> {
  public FootballCSVAdapter(IReader reader) {
    super(reader);
  }

  @Override
  public ArrayList<Football> read() {
    ArrayList<Football> list = new ArrayList<>();
    ArrayList<String[]> data = (ArrayList<String[]>) this.reader.read();

    for (String[] input : data) {
      String teamName = input[0];
      int goals = Integer.parseInt(input[5]);
      int goalsAllowed = Integer.parseInt(input[6]);

      Football f = new Football(teamName, goals, goalsAllowed);

      list.add(f);
    }
    return list;
  }
}