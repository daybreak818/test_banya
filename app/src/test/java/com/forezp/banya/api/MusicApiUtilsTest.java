package com.forezp.banya.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daybreak on 2018/8/7.
 */
public class MusicApiUtilsTest {
    public MusicApiUtils musicApiUtilstest;
    @Before
    public void setUp() throws Exception {
    musicApiUtilstest = new MusicApiUtils();
    }

    @Test
    public void getApiTag() throws Exception {
        int pos = 4;
        assertArrayEquals(musicApiUtilstest.getApiTag(pos),null);
    }

}