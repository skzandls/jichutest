package se;

import java.net.SocketOption;

/**
 * @author skz
 * @version 1.0
 * @date 2020/11/30 8:26 下午
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(Demo04.max(4,9));
        Demo04.change(2,3);


    }
    public static int max(int num1,int num2){
        if(num1==num2){
            return 0 ;
        }else if(num1>num2){
              return num1;
        }else{
            return num2;
        }

    }
    public static void change(int ... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}
