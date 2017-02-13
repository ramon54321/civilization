# Civilization

## Map
Maps are stored in the `WorldMap` class. The class stores data points which can be retrieved and set with a `Vec2i` position key.

## Resources
Resources are declared in the `Resources` enum. Resources can be added to the enum without effecting use. The resources are stored in the `ResourcesStore` class, which each civilization will have. The `ResourcesStore` class has methods to increment and decrement and check resource levels. If the resource does not exist in the store, the resource will be added upon increment, and if the decrement will result in a negative resource level, the resource will not be decremented at all and the method will return false.
