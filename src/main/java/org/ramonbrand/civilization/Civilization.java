package org.ramonbrand.civilization;

import org.ramonbrand.civilization.resources.*;
import org.ramonbrand.civilization.utilities.*;
import org.ramonbrand.civilization.world.*;

public class Civilization implements IPositional {
  public static void main(String[] args){
    System.out.println("Started!");


  }

  // Resources
  public ResourceStore resourceStore = new ResourceStore();

  // Areas / Territory
  public PositionalHashMapSet<WorldArea> civilizationAreas = new PositionalHashMapSet();

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



  // Implementations
  public Vec2i getMarkerPosition(){
    return new Vec2i(1,1);
  }

}
