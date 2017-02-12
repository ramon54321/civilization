package org.ramonbrand.civilization;

import org.ramonbrand.civilization.resources.*;

public class Civilization {
  public static void main(String[] args){
    System.out.println("Started!");

    ResourceStore store = new ResourceStore();

    store.increment(Resource.Iron, 56);

    System.out.println(store.countOf(Resource.Copper));
    System.out.println(store.countOf(Resource.Iron));

    store.increment(Resource.Iron, 56);

    System.out.println(store.countOf(Resource.Copper));
    System.out.println(store.countOf(Resource.Iron));

    store.decrement(Resource.Iron, 22);

    System.out.println(store.countOf(Resource.Iron));

    store.increment(Resource.Iron, -44);

    System.out.println(store.countOf(Resource.Iron));

    store.decrement(Resource.Iron, 235);

    System.out.println(store.countOf(Resource.Iron));
  }

}
