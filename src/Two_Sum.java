import java.io.*;
public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            for (int j=i;j<length;j++){
                if (nums[i]+nums[j]==target){
                    int[] b={i,j};
                    return b;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");//若无此句，则会报错，无返回
    }
}
