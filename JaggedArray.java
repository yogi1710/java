// Jagged array is the array which do not have the same array sizes in all the inner arrays
// i.e in multi dimensional arrays we have to use same size of arrays in the inner arrays 
// The arrays which do not have same array sizes are called as jagged arrays
// [[1,2,3],[5,6,2,1,4,1],[9,8,7,4,3,3,3,3,33,9]] size of three inners arrays are different
public class JaggedArray {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j= 0;j<nums[i].length;j++){
                //Math.random returns the value randomly,but the range is with in the 0 to 1
                // To get the single digit value,we need to multiply the genarted value with 10
                // nums[i][j] = (int)(math.random()*10);
                // To get the double digit value,we need to multiply the genarted value with 100  
                nums[i][j] = (int)(Math.random()*100);
                // System.out.print(nums[i][j]+" ");
            }
            // System.out.println();
        }

        // Enhance for loop
        // Here ,we don't need to specify the size explicitly.
        
        
        for(int n[]: nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
