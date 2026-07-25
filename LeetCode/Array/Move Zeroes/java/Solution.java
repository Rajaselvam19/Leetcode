class Solution {
    public int[] moveZeroes(int[] arr) {
        int[] arr1 = new int[arr.length];
               int k = 0;
        for(int h=0;h<arr.length;h++){
            
              if (arr[h] != 0) {
              arr1[k] = arr[h];
                k++;
            }
        }
 
        for (int i = 0; i < arr.length; i++) {
                arr[i] = arr1[i];
        }

        return arr;
    }
}