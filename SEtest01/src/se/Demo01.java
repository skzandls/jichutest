package se;

/**
 * @author skz
 * @version 1.0
 * @date 2020/10/25 5:20 下午
 */
public class Demo01 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int i1 = 1; i1 <=i; i1++) {
                System.out.print(i+"*"+i1+"\t");
            }
            System.out.println("");

        }
    }
}
