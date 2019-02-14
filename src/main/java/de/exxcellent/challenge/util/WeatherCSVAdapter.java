package de.exxcellent.challenge.util;

import java.util.ArrayList;

import de.exxcellent.challenge.io.IReader;
import de.exxcellent.challenge.model.Weather;

/**
 * WeatherCSVAdapter
 */
public class WeatherCSVAdapter extends AbstractAdapter<Weather> {

  public WeatherCSVAdapter(IReader reader) {
    super(reader);
  }

  @Override
  public ArrayList<Weather> read() {
    ArrayList<Weather> list = new ArrayList<>();
    ArrayList<String[]> data = (ArrayList<String[]>) this.reader.read();

    for (String[] input : data) {
      String day = input[0];
      float MxT = Float.parseFloat(input[1]);
      float MnT = Float.parseFloat(input[2]);

      Weather e = new Weather(day, MxT, MnT);
      list.add(e);
    }
    return list;
  }
}