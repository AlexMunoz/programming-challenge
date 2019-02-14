package de.exxcellent.challenge.model;

/**
 * Football
 */
public class Football {

  private String TeamName;
  private int Goals;
  private int GoalsAllowed;

  public Football(String TeamName, int Goals, int GoalsAllowed) {
    this.TeamName = TeamName;
    this.Goals = Goals;
    this.GoalsAllowed = GoalsAllowed;
  }

  /**
   * @return the Team Name
   */
  public String getTeamName() {
    return TeamName;
  }

  /**
   * @return the Goals
   */
  public int getGoals() {
    return Goals;
  }

  /**
   * @return the Goals Allowed
   */
  public int getGoalsAllowed() {
    return GoalsAllowed;
  }
}