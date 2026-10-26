Phase 1
Created artifact class. Added String variable for name. Added Integer variable for ID. Using the Integer wrapper will allow ID to be treated as an object and prevent value of "0" before ID is assigned, will instead be "null". Created a static variable to track the number of instances created. Added a constructor to the class to increment the artifact count. This created the artifact "Super Class" that sets behavior for all artifacts regardless of their subclass

Phase 2
Added final static variable, "UCC_VALUE", with type double, to the artifact class. Assigned the value of 3.14159 to the "UCC_VALUE". Added code to main to display UCC_VALUE. By setting the UCC_Value to static final this locks this value and cannot be modified later in the code and sets it to the artifact class, not any single instance.

