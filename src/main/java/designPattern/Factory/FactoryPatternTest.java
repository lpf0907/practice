package designPattern.Factory;


import org.junit.Test;

public class FactoryPatternTest {
    @Test
    public void test(){
        try {
            FactoryPattern.produce("car");
            FactoryPattern.produce("bus");
            FactoryPattern.produce("ssss");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}