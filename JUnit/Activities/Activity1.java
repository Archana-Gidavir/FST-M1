package session4;

import java.util.ArrayList;
import org.junit.jupiter.api.*;

public class Activity1 {
    
    static ArrayList<String> list;

    @BeforeAll
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha"); 
        list.add("beta"); 
        
        System.out.println("list element in setUp - " + list);
    }

    @Test
    public void insertTest() {
        
    	Assertions.assertEquals(2, list.size(), "size are not as expected");
        
        list.add(2, "charlie");
        System.out.println("list element insertTest - " + list);
    
        Assertions.assertEquals(3, list.size(), "size are not as expected");

        Assertions.assertEquals("alpha", list.get(0), "element are not as expected");
        Assertions.assertEquals("beta", list.get(1), "element are not as expected");
        Assertions.assertEquals("charlie", list.get(2), "element are not as expected");
    }

    @Test
    public void replaceTest() {
        
        list.set(1, "charlie");
        list.set(0, "Gamma");
        System.out.println("list element replaceTest - " + list);
        
        Assertions.assertEquals(2, list.size(), "size are not as expected");
        
        Assertions.assertEquals("alpha", list.get(0), "element are not as expected");
        Assertions.assertEquals("charlie", list.get(1), "element are not as expected");
    }
}