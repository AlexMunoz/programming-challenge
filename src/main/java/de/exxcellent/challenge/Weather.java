package de.exxcellent.challenge;

/**
 * Weather
 */
public class Weather {
  private String Day;
  private float MxT;
  private float MnT;

  public Weather(String Day, float MxT, float MnT) {
    this.Day = Day;
    this.MxT = MxT;
    this.MnT = MnT;
  }

  /**
   * @return the day
   */
  public String getDay() {
    return Day;
  }

  /**
   * @return the maximum temperature
   */
  public float getMxT() {
    return MxT;
  }

  /**
   * @return the minimum temperature
   */
  public float getMnT() {
    return MnT;
  }
}