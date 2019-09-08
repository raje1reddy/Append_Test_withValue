

import org.junit.Test;
import java.lang.StringBuilder;


import static org.junit.Assert.assertEquals;



public class StringAppendTest {

    @Test
    public void appendTest1() {

        StringBuilder sb1 =  new StringBuilder();
        sb1.append("JAVA");

        sb1.append((new StringAppend("Oracle")).getName());

        System.out.println(sb1.toString());

        //StringBuilder sb2 =  new StringAppend;
        // System.out.println(sb2);
        // String expectedresult = "JAVAcom.padmaja.stringreplace.StringAppend@e2144e4";
        // String expectedresult = "JAVAcom.padmaja.stringreplace.StringAppend@2d928643";
        //assertEquals(sb1,sb2);
    }
}



