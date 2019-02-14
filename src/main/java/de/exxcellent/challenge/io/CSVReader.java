package de.exxcellent.challenge.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * CSVReader
 */
public class CSVReader implements IReader {
  private Scanner in;

  public CSVReader(String filePath) {
    try {
      this.in = new Scanner(new File(filePath));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
  public ArrayList<String[]> read() {
    ArrayList<String[]> lines = new ArrayList<String[]>();
    in.nextLine();
    while (in.hasNextLine()) {
      String line = in.nextLine();
      lines.add(line.split(","));
    }
    in.close();
    return lines;
  }
}