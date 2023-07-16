public class MultiDim2 {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                //Math.random returns the value randomly,but the range is with in the 0 to 1
                // To get the single digit value,we need to multiply the genarted value with 10
                // nums[i][j] = (int)(math.random()*10);
                // To get the double digit value,we need to multiply the genarted value with 100  
                nums[i][j] = (int)(Math.random()*100);
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }


        for(int n[]:nums){
            for(int m : n){
                System.out.print(m+" ");
            }
            System.out.println();        
        }   
    }
}
