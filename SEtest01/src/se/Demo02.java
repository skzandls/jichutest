package se;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
import jdk.nashorn.internal.parser.JSONParser;
import sun.jvm.hotspot.ui.SysPropsPanel;

/**
 * @author skz
 * @version 1.0
 * @date 2020/10/27 9:39 下午
 */
public class Demo02 {
    public static void main(String[] args) {
            //不定项参数
        Demo02 demo02 = new Demo02();
        demo02.maxPrint(3,25,7,40,66,9);

    }
    public  void maxPrint(int ...ints){
        int a = ints[0];
        for (int x :ints
             ) {
            if (x>a){
                a=x;
            }


        }
        System.out.println(a);
    }

    
}
