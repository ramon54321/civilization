package org.ramonbrand.civilization.utilities;

import java.lang.Comparable;

/***
 * Basic vector 2 class which stores x and y coordinates in int form.
 */
public class Vec2i implements Comparable<Vec2i>{
  public int x;
  public int y;

  public Vec2i(int x, int y) { this.x = x; this.y = y; }

  public int compareTo(Vec2i o){
    if(this.x == o.x && this.y == o.y) { return 0; } // If its same - return 0
    else if(this.y < o.y) { return -1; } // If row is lower - return -1
    else if(this.y > o.y) { return 1; } // If row is higher - return 1
    else if(this.x < o.x) { return -1; } // If row is same but column is lower - return -1
    else if(this.x > o.x) { return 1; } // If row is same but column is higher - return 1
    else { return -1; } // Should never happen, defaults to -1
  }

  @Override
  public boolean equals(Object o){
    if(!(o instanceof Vec2i)) { return false; } // If object is of different type
    if(o == this) { return true; } // If its the same object, return true
    Vec2i vo = (Vec2i) o; // Cast
    if(this.x == vo.x && this.y == vo.y) { return true; } // If its same - return true
    return false;
  }

  @Override
  public int hashCode(){
    int result = this.x;
    result = 31 * result + this.y;
    return result;
  }
}
