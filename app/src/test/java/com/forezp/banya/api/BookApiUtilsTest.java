package com.forezp.banya.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daybreak on 2018/8/6.
 */
public class BookApiUtilsTest {
    public BookApiUtils  bookApiUtilstest;
    @Before

    public void setUp() throws Exception {
        bookApiUtilstest = new BookApiUtils();
    }

    @Test
    public void getApiTagtest() throws Exception {
        int pos =5;
        assertArrayEquals(bookApiUtilstest.getApiTag(pos),null);
    }

}