package com.forezp.banya.api;

import android.util.Log;

import static org.junit.Assert.*;

/**
 * Created by daybreak on 2018/8/6.
 */
public class BookApiUtilsTest {
    public BookApiUtils  bookApiUtilstest;
    @org.junit.Before

    public void setUp() throws Exception {
        bookApiUtilstest = new BookApiUtils();
    }

    @org.junit.Test
    public void getApiTagtest() throws Exception {
        int pos =5;
        if(bookApiUtilstest.getApiTag(pos)==null)
            Log.i("apitest","test successful");
    }

}