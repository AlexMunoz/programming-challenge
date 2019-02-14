package de.exxcellent.challenge.util;

import java.util.ArrayList;
import de.exxcellent.challenge.io.IReader;

/**
 * IAdapter
 */
public abstract class AbstractAdapter<T> {
  protected IReader reader;

  public AbstractAdapter(IReader reader) {
    this.reader = reader;
  }

  /**
   * Adapt input to a T Object
   * 
   * @return list of T objects
   */
  public abstract ArrayList<T> read();
}