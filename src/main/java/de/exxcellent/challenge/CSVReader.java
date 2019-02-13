package de.exxcellent.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Reader
 */
public class CSVReader {

  private Scanner in;

  public CSVReader(String filePath) {
    try {
      this.in = new Scanner(new File(filePath));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public ArrayList<Weather> read() {
    ArrayList<Weather> list = new ArrayList<>();
    in.nextLine();
    while (in.hasNext()) {
      String[] line = in.nextLine().split(",");
      String Day = line[0];
      Float MxT = Float.parseFloat(line[1]);
      Float MnT = Float.parseFloat(line[2]);
      Weather w = new Weather(Day, MxT, MnT);
      list.add(w);
    }
    return list;
  }
}