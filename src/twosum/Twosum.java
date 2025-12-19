/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum; 

import java.util.HashMap;

/**
 *
 * @author sifis
 */
class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            
            int dif  = target - nums[i];
            if(map.containsKey(dif)){
                return new int[] {i,map.get(dif)};
            }
           map.put(nums[i],i); 
        }
         return new int[] {0,0};
    }
}

public class Twosum {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Solution solo = new Solution();
        int[] nums = {2,7,11,15};
        System.out.println(solo.twoSum(nums , 9)[0]+"   "+solo.twoSum(nums , 9)[1]);
    }
    
}
