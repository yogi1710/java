public class MultiDimArray {
    public static void main(String[] args) {
        int nums[][] = {{10,20,30},{1,8,6},{4,8,6},{81,54,52}};
        for( int i = 0;i<nums.length;i++){
            System.out.print("[");
            for(int j = 0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+",");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
