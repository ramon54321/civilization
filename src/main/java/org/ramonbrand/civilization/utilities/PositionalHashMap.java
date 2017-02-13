package org.ramonbrand.civilization.utilities;

import org.ramonbrand.civilization.resources.*;
import org.ramonbrand.civilization.world.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class PositionalHashMap<T> {

  private Map<Vec2i, T> map = new HashMap();

  /***
   * Sets the element at the position of the map.
   */
  public void setToMap(Vec2i position, T element){
    map.put(position, element);
  }

  /***
   * @return The element in the map at the given position.
   */
  public T getFromMap(Vec2i position){
    return map.get(position);
  }

}
