/*
 * Author: Alex Rueb
 * Date: 4/13/18
 * Overview: Lab 7, practicing with test driven development
 *
*/
package testing;

public class Testing {

    public Testing() {
    }

    public static int[] makeChange(int[] coins, int change) {
        
        //throws if empty array is passed
        if (coins.length == 0){
            throw new IllegalArgumentException("Array of size 0 is not allowed");
            
        }
        
        
        int changeLeft = change;
        int[] coinChange = new int[10];
        int j = 0;
        while (changeLeft != 0) {
            
            for (int i = 0; i < coins.length; i++) {

                if (coins[i] <= changeLeft) {
                    do {
                        changeLeft -= coins[i];
                        coinChange[j] = coins[i];
                        j++;
                    } while (coins[i] <= changeLeft);

                } else {

                }
            }
        }
        return coinChange;
    }

}
