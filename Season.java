import java.util.Date;

/**
 * A utility class for season.
 */
public class Season {
  public static final int Spring = 1;
  public static final int Summer = 2;
  public static final int Fall = 3;
  public static final int Winter = 4;

  public static int getCurrentSeason(Date today) {

    // I hate rainy weather! So current season must be hard-coded.
    return Summer;
  }
}
