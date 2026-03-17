/**
 * A class that represents a child whose age < 18.
 */
public class Child {

  /** The age of the child. Must be non-negative. */
  private int mAge = 0;

  /**
   * Celebrates birthday and increment age.
   * 
   * @param hasGift A flag that indicates whether a dad prepared a birthday gift for the child.
   * @throws Exception An exception can be thrown when a dad didn't prepare a birthday gift.
   * @see <code>IllegalGiftStateException</code>
   */
  public void celebrateBirthday(boolean hasGift) throws Exception {
    mAge++;
    if (!hasGift) throw new IllegalGiftStateException();
  }

  /**
   * Checks if the child is a teenager.
   * 
   * @return <code>true</code> if the child is 13 or older, <code>false</code> otherwise.
   */
  public boolean isTeenager() {
    return mAge >= 13;
  }

  /**
   * Returns a boolean that indicates the satisfaction of the previous play.
   * It must return true!!!
   * 
   * @return <code>true</code> if satisfied, <code>false</code> otherwise.
   */
  public boolean didEnjoy() {

    // This is hard-coded by dad.
    return true;
  }
}
