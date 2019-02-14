package de.exxcellent.challenge.util;

import java.util.Comparator;

import de.exxcellent.challenge.model.Weather;

public class SortWeatherBySmallTempDiff implements Comparator<Weather> {
  @Override
  public int compare(Weather A, Weather B) {
    return A.getMxT() - A.getMnT() < B.getMxT() - B.getMnT() ? -1 : 1;
  }
}