class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;  // Get the size of the flowerbed

        // If no flowers need to be planted, return true
        if (n == 0) {
            return true;
        }

        // Iterate through the flowerbed
        for (int i = 0; i < length; i++) {

            // If the current plot is empty (0), check the adjacent plots
            if (flowerbed[i] == 0) {
                
                // Check if the left plot is empty or out of bounds (for the first plot)
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                
                // Check if the right plot is empty or out of bounds (for the last plot)
                boolean rightEmpty = (i == length - 1) || (flowerbed[i + 1] == 0);
                
                // If both adjacent plots are empty, plant a flower
                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;  // Plant the flower
                    n--;  // Decrease the number of flowers to be planted
                    
                    // If no more flowers need to be planted, return true
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }

        // If not enough flowers were planted, return false
        return false;
    }
}
