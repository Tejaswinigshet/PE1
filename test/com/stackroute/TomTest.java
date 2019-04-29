package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;

        import static org.junit.Assert.*;

public class TomTest{

    Tom o;

    @Before
    public void setUp() throws Exception {

        o=new Tom();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check()
    {
        String res=o.checkEvenOdd();
        assertEquals("Jerry", res);
    }

    @Test
    public void checkRange()
    {
        String res=o.checkRange();
        assertEquals("True", res);
    }

    @Test
    public void checkNull()
    {
        boolean res=o.checkNull();
        assertEquals(true, res);
    }
}