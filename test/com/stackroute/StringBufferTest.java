package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBufferTest {

    StringBuffer rs;

    @Before
    public void setUp() throws Exception {

        rs=new StringBuffer();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStr()
    {
        String rev=rs.reverseStr();
        assertEquals("iniwsajeT", rev);
    }
}