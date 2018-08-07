package com.forezp.banya.api;

import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daybreak on 2018/8/6.
 */
public class ApiFactoryTest {
    public ApiFactory Apitest;
    @Before
    public void setUp() throws Exception {
        Apitest = new ApiFactory();
    }

    @Test
    public void getDoubanApiSingleton() throws Exception {

        Log.i("tag","$$$$$$$$$$$");
        assertEquals(Apitest.getDoubanApiSingleton(),null);
    }

}