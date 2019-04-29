package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;

public class CapitalTest {
    CapitalTest upper;

    @Before
    public void setUp() throws Exception {
        upper=new CapitalTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public String stringDemo() {


        String res=upper.stringDemo();

        //assert
        assertEquals("TEJASWINI", res);
        return res;

    }

    @Test
    public boolean checkNull()
    {
        boolean res=upper.checkNull();
        assertEquals(true, res);
        return res;
    }
}