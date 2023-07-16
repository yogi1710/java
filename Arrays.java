public class Arrays {
    public static void main(String[] args) {
        int nums[] = {3,7,5,9};
        int num1[] = new int[4];
        //defaultly the values are set to be zero.
        System.out.println(num1[2]);        
        System.out.println(nums[1]);
        System.out.println();
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
