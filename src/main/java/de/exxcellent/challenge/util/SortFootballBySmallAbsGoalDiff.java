package de.exxcellent.challenge.util;

import java.util.Comparator;

import de.exxcellent.challenge.model.Football;

public class SortFootballBySmallAbsGoalDiff implements Comparator<Football> {
  @Override
  public int compare(Football A, Football B) {
    return Math.abs(A.getGoals() - A.getGoalsAllowed()) < Math.abs(B.getGoals() - B.getGoalsAllowed()) ? -1 : 1;
  }
}