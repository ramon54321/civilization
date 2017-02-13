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

  private Map<Vec2i, WorldTile> worldTileMap = new HashMap();
  private Map<Vec2i, HashSet<WorldArea>> worldAreas = new HashMap();


  public WorldMap(){}

  /***
   * @return Returns the tile from the world tile map which has the given coordinates.
   */
  public WorldTile getTileFromMap(Vec2i tilePosition){
    return worldTileMap.get(tilePosition);
  }

  /***
   * Sets the tile in the world tile map to the tile specified at the given coordinates.
   */
  public void setTileToMap(Vec2i tilePosition, WorldTile worldTile){
    if(!worldTileMap.containsKey(tilePosition)) { worldTileMap.put(tilePosition, worldTile); return; }
    worldTileMap.put(tilePosition, worldTile);
  }

  /***
   * Gets all the areas in section and returns them in the form of a Set.
   *
   * The method simply gets all areas which have been added to the specifc section position
   * earlier. Choosing a section will be up to the area creation method.
   */
  public Set<WorldArea> getAreasFromMap(Vec2i areaSectionPosition){
    return worldAreas.get(areaSectionPosition);
  }


}
