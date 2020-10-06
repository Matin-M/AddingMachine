package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history = "";
  
  /**
   * Default constructor.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * Getter method that returns the total.
   * @return
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds passed parameter to total.
   * @param value
   */
  public void add (int value) {
    total += value;
    history += " + "+ value;
  }

  /**
   * Subtracts passed parameter to total.
   * @param value
   */
  public void subtract (int value) {
    total -= value;
    history += " - "+ value;
  }

  /**
   * toString method.
   */
  @Override
  public String toString () {
    return history;
  }

  /**
   * Sets total and history to 0.
   */
  public void clear() {
    total = 0;
    history = "0";
  }
}