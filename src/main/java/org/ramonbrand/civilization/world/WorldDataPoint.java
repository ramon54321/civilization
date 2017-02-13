package org.ramonbrand.civilization.world;

import org.ramonbrand.civilization.*;
import org.ramonbrand.civilization.utilities.*;
import org.ramonbrand.civilization.resources.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/***
 * Stores a world data point.
 */
public class WorldDataPoint {

  public WorldDataPoint(){}

  /***
   * The civilizations which claim ownership to the land.
   */
  private Set<Civilization> civilizations = new HashSet();
  /***
   * Add a civ to the list of civs the tile is owned by.
   */
  public Set<Civilization> addCivilizationToTile(Civilization civilization){
    civilizations.add(civilization);
    return civilizations;
  }
  /***
   * Remove the given civ from the owned civ set.
   */
  public Set<Civilization> removeCivilizationFromTile(Civilization civilization){
    civilizations.remove(civilization);
    return civilizations;
  }

  /***
   * Resources contained in the data point. Can be extracted, but is not included in the civ's stockpile before extraction, even if the point is owned by a civ.
   */
  private ResourceStore resources = new ResourceStore();

}
