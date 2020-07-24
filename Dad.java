import java.util.List;

/**
 * A class that represents the world's most common dads.
 */
public interface Dad {

  /**
   * Plays with the given children.
   * 
   * @param children A list of children.
   * @throws Exception An exception can be thrown when a dad didn't expect the
   *                   current situation.
   * @see <code>DadCapacityExceededException</code>,
   *      <code>DeadlockException</code>
   */
  void play(List<Child> children) throws Exception;
}
