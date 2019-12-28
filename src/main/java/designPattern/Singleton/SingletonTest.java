package designPattern.Singleton;

import org.junit.Test;
public class SingletonTest {
    Singleton demo1 = Singleton.getInstance();
    Singleton demo2 = Singleton.getInstance();
    @Test
    public void test(){
        System.out.println(demo1==demo2);
    }
}