package org.ramonbrand.civilization.world;

import org.ramonbrand.civilization.utilities.*;
import org.ramonbrand.civilization.world.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/***
 * Stores a world map in a hashmap, which is accessable in constant time, irrespect of size.
 */
public class WorldMap {

  public PositionalHashMap<WorldTile> worldTiles = new PositionalHashMap();
  public PositionalHashMapSet<WorldTile> worldTilesPositional = new PositionalHashMapSet();

  public WorldMap(){}


}
