package org.ramonbrand.civilization.resources;

import org.ramonbrand.civilization.resources.*;
import java.util.Map;
import java.util.HashMap;
import java.lang.Math;

/***
 * The main store of resources. Most commonly used in a civilization object to store the units of resources.
 *
 * Manages all aspects of resources, including incrementing and decrementing specific resources.
 */
public class ResourceStore {

  private Map<Resource, Long> resources = new HashMap();

  public ResourceStore(){}

  /***
   * Returns how many units the resource store has of the requested resource.
   * @param resource The resource to query.
   */
  public long countOf(Resource resource){
    if(!resources.containsKey(resource)) return 0;
    return resources.get(resource);
  }

  /***
   * Returns true if the store has at least the number of units of the specified resource.
   * @param resource The resource to query.
   * @param count The number of units to check.
   */
  public boolean has(Resource resource, long count){
    return countOf(resource) >= count;
  }

  /***
   * Decreases the resource with the specified number.
   * @param resource The resource to query.
   * @param count The number of units to decrement by.
   * @return Returns true if the decrement was successful.
   */
  public boolean decrement(Resource resource, long count){
    count = Math.max(0, count);
    if(!has(resource, count)) return false;
    resources.put(resource, resources.get(resource) - count);
    return true;
  }

  /***
   * Increase the resource with the specified number. If the resource does not exist in the store, it will be created and set to the value of the increment.
   * @param resource The resource to query.
   * @param count The number of units to increment by.
   * @return Returns true if the increment was successful.
   */
  public boolean increment(Resource resource, long count){
    count = Math.max(0, count);
    if(!resources.containsKey(resource)){
      resources.put(resource, count);
      return true;
    } else {
      resources.put(resource, resources.get(resource) + count);
      return true;
    }
  }

}
