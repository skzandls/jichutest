package se;

/**
 * @author skz
 * @version 1.0
 * @date 2020/10/28 11:53 上午
 */

// a new test test1
public class Demo03 {
    public static void main(String[] args) {
        int [] test= {1,2,4,9,10,3,5,22,2,10};
        Demo03 demo03 = new Demo03();
        test=demo03.maopao(test);
        System.out.println(test);
        for (int x :test
             ) {
            System.out.println(x);

        }


    }
    public  int[] maopao(int[] ars){
        int temp;
        for (int i=0;i<ars.length-1;i++){
            for (int j=0;j<ars.length-1-i;j++){
                if(ars[j]>ars[j+1]){
                    temp =ars[j];
                    ars[j]=ars[j+1];
                    ars[j+1]=temp;
                }
            }
        }
        return ars;
    }
}
