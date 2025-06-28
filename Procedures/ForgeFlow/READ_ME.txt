NOTES:

- See the battery update tick procedure for a example how to use these blocks.

RESET SCRIPT:

- This script should be outside of your limitor script.
- Its main use is to update the flow direction every time the global timer reaches 0.
- This allows the blocks and storage blocks to re-calculate the flow path.
- This is also really important to make sure when generators are removed that the path
  is re-calculated.
  
LIMITER SCRIPT:

- The limitor script should encase your energy script for your cable, pipe, or storage block.
- The main use for this is to make sure the energy can not become buggy.
- If you limit the distance so it only goes until the forgeFlow NBT variable 
  is a positive number then the script will work properly.
  
EXTEND SCRIPT:

- This script goes in the same position as your enegy or fluid add/remove blocks.
- This will only run if the block has a positive forgeFlow NBT value, which is important
  To make sure the script extends the NBT value to the next block.
- It works by decreasing the NBT value of the current block by 1.
- The direction won't go back thedirection it came from the generators
  so it will always flow down the line of cables, pipes, or devices.
