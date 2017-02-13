package org.ramonbrand.civilization.utilities;

import org.ramonbrand.civilization.resources.*;
import org.ramonbrand.civilization.world.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PositionalHashMapSet<T extends IPositional> {

  private Map<Vec2i, HashSet<T>> map = new HashMap();

  /***
   * Adds an element at the position into the map.
   */
  public void addToMap(Vec2i position, T element){
    map.get(position).add(element);
  }

  /***
   * @return The elements in the form of a Set<T> which were retreived from the map at the given position.
   */
  public Set<T> getFromMap(Vec2i position){
    return map.get(position);
  }

  /***
   * Calculate each elements marker position.
   */
  public void recalculatePositions(){
    //TODO: Calculate closest marker and assign to map.
  }


}
