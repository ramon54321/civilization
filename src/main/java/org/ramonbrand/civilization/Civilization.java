package org.ramonbrand.civilization;

import org.ramonbrand.civilization.actions.*;
import org.ramonbrand.civilization.resources.*;
import org.ramonbrand.civilization.utilities.*;
import org.ramonbrand.civilization.world.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Civilization {
  public static void main(String[] args){
    System.out.println("Started!");

    WorldMap worldMap = new WorldMap();
    worldMap.worldDataPoints.setToMap(new Vec2i(0,1), new WorldDataPoint());
  }

  // Control
  /***
   * Contains a list of requests for the player/s to act on.
   */
  public List<ActionRequest> actionRequests = new ArrayList();

  // Resources
  /***
   * Resources stored by the civ.
   */
  public ResourceStore resourceStore = new ResourceStore();

  // Areas / Territory
  /***
   * Data points owned by the civ.
   */
  public PositionalHashMap<WorldDataPoint> ownedDataPoints = new PositionalHashMap();

  // Players

  // Population

  // Economy
    // Industry
    // Population Consumption

  // Relations

  // Trade

  // Law

  // Research

  // Military


}
