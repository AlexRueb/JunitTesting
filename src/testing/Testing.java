/**
 * @authors: Nick Tonjum, Alex Rueb, Connor Lowe
 * Date: 24 April 2018
 * Overview: A program that was developed on the concepts of dynamic
 * programming with the assistance of the JUnit Testing framework. The program 
 * itself solves the minimum coin change proglem.  
 */
package testing;

public class Testing {                                          //inspired from GeeksForGeeks
     
     public static int[] makeChange(int coins[], int total){    //method to make change
          //throws if empty array is passed
        if (coins.length == 0){
            throw new IllegalArgumentException("Array of size 0 is not allowed");
            
        }
        int temp[] = new int[total + 1];                        //make an array to store 
        int bestChange[] = new int[total + 1];                  //make an array to store the best amount of change
        temp[0] = 0;                                            //make the first value 0
        for(int i=1; i <= total; i++){                          //start loop to go through each array
            temp[i] = Integer.MAX_VALUE-1;                      //make all values in temp array max values
            bestChange[i] = -1;                                 //make all values in best change -1
        }
        for(int j=0; j < coins.length; j++){                    //start loop to go through the coins array
            for(int i=1; i <= total; i++){                      //start loop to go through and make the best change
                if(i >= coins[j]){                              
                    if (temp[i - coins[j]] + 1 < temp[i]) {
                        temp[i] = 1 + temp[i - coins[j]];
                        bestChange[i] = j;                      //replace value in best change with j
                    }
                }
            }
        }
        
        if (bestChange[bestChange.length - 1] == -1) {      //start print
            System.out.print("There is no solution\n");     //if there is no best change
            return bestChange;                              //return 0 after printing no solution
        }
        System.out.print("The best change is: ");
       
        int finalCt = 0;
        int temp2[] = new int[total+1];
        int end = bestChange.length - 1;                    //end is the end of the best change array
        while (end != 0) {                                  //while we haven't gone through the array
            int x = bestChange[end];                        //have variable x be the value at end
            System.out.print(coins[x] + " ");               //print out the value in coins array at x
            temp2[finalCt] = coins[x];
            end -= coins[x];                                //move end to 
            finalCt++;
            
        }
        System.out.print("\n");                             //end print
        int finalAr[] = new int [finalCt];
        for(int i = 0; i < finalCt; i++){
            finalAr[i] = temp2[i];
        }
        return finalAr;                                 //returns the value of total solutions
    }
 
}
