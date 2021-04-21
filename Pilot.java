import java.util.List;

/**
 * Interface for Pilot.
 */
public interface Pilot {

  /**
   * Enum for license type.
   */
  public enum License {
    PrivatePilot, CommercialPilot, AirlineTransportPilot
  }

  /**
   * Enum for rating type.
   */
  public enum Rating {
    Instrument, MultiEngine
  }

  /**
   * Gets a type of current license.
   *
   * @return A type of current <code>License</code>.
   */
  License getLicense();

  /**
   * Gets a list of current ratings.
   * 
   * @return A list of current <code>Ratings</code>.
   */
  List<Rating> getRatings();
}