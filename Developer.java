import java.util.List;

/**
 * An abstract class that represents developers, software engineers, and
 * software development engineers.
 */
public abstract class Developer {

  /**
   * Gets a list of programming languages that a developer can use.
   * 
   * @return A list of programming languages. Max 5 languages.
   */
  public abstract List<Language> getAvailableProgrammingLanguages();

  /**
   * Works hard.
   */
  public void work() {
    // attend(dailyStandUp);
    // pair(colleague);
    // attend(reviewMeeting);
    // ...
    // ...
  }
}
