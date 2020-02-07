package cn.zhaojishun;

import java.util.Arrays;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Shunji Zhao
 * @create: 2020-02-04 21:12
 */
public class Demo {
    //nums = [2, 7, 11, 15], target = 9
    public static int[] twoSum(int[] nums, int target) {
        int[] r = {0, 0};

        first:for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                if(nums[i] + nums[i1] == target){
                    r = new int[]{i, i1};
                    break first;
                }
            }
        }
        return r;

    }

    public static void main(String[] args) {
        //[3,2,4]
        //6
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,5,11,10}, 10)));
    }

}