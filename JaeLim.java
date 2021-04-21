import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

public class JaeLim extends Developer implements Dad, Golfer, YardWorker {

  /**
   * Gets my children from SUPER secret storage.
   * 
   * @return A list of my children.
   */
  private static List<Child> getMyChildren() {
    return Arrays.asList(new Child(), new Child());
  }

  /**
   * Gets a list of programming languages that a developer can use.
   * 
   * @return A list of programming languages. Max 5 languages.
   */
  @Override
  public List<Language> getAvailableProgrammingLanguages() {
    return Arrays.asList(Language.Java, Language.CSharp, Language.ObjectiveC, Language.C, Language.Ruby);
  }

  /**
   * Works hard.
   */
  @Override
  public void work() {

    // Re-factor this method to be comparable at home office.
    super.work();
  }

  /**
   * Plays with the given children.
   * 
   * @param children A list of children.
   * @throws Exception An exception can be thrown when a dad didn't expect the
   *                   current situation.
   * @see <code>DadCapacityExceededException</code>,
   *      <code>DeadlockException</code>
   */
  @Override
  public synchronized void play(@NonNull List<Child> children) throws Exception {

    // Validation
    if (children.size() > 2) {
      throw new DadCapacityExceededException();
    }

    // ...

    // Verify result
    if (children.stream().anyMatch(child -> !child.didEnjoy())) {
      throw new DeadlockException();
    }
  }

  public static void main(String[] args) throws Exception {
    JaeLim myself = new JaeLim();
    Date today = new Date();

    Scheduler.scheduleGolf(myself, Collections.singletonList(Day.Saturday));

    if (Season.getCurrentSeason(today) == Season.Summer) {
      Scheduler.scheduleYardWorker(myself, Collections.singletonList(Day.Sunday),
          Arrays.asList(Lawn.Backyard, Lawn.Frontyard, Lawn.Shrubs));
    }

    myself.work();
    myself.play(getMyChildren());
  }
}