package se;

/**
 * @author skz
 * @version 1.0
 * @date 2020/12/2 10:22 下午
 */

//this is  a test1

public class ArrayDemo01 {
    public static int[] nums = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        ArrayDemo01.resever(nums);
        for (int num:
             nums) {
            System.out.println(num);

        }
        //System.out.println(nums);
    }
    int [][]num1=new int[2][5];


    //int []num ;
    //int []num = new int[5];
    public static int[] resever(int[] array) {
        int a;
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            a=array[i];

            array[i] = array[j];
            array[j] =a;
            if(i==j)
                break;
        }
        return array;


    }
}
