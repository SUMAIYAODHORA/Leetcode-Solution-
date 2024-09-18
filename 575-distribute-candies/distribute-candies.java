class Solution {
    public int distributeCandies(int[] candyType) {
        // Calculate the number of candies Alice is allowed to eat (n / 2)
        int allowedCandies = candyType.length / 2;
        
        // Sort the array to group the same candy types together
        Arrays.sort(candyType);
        
        // Count the number of unique candy types
        int uniqueCandies = 1;  // Start with 1 because the first candy is always unique
        
        // Iterate through the sorted array and count the unique candies
        for (int i = 1; i < candyType.length; i++) {
            if (candyType[i] != candyType[i - 1]) {
                uniqueCandies++;
            }
        }
        
        // The result is the smaller of the number of unique candies or the allowed candies
        return Math.min(uniqueCandies, allowedCandies);
    }
}