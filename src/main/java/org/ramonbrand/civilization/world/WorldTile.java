package org.ramonbrand.civilization.world;

import org.ramonbrand.civilization.utilities.*;

/***
 * Stores a world tile, which contains all data related to the specific position in the world.
 */
public class WorldTile implements IPositional {

  public Vec2i getMarkerPosition(){
    return new Vec2i(1,1);
  }

}
