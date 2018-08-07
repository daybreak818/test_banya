package com.forezp.banya.viewimpl.book;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 王诗璇 on 2018/8/7.
 */
public class BookFragmentTest {
    public BookFragment bookFragmenttest;
    @Before
    public void setUp() throws Exception {
    bookFragmenttest = new BookFragment();
    }

    @Test
    public void hasMultiFragmenttest() throws Exception {
        assertEquals(bookFragmenttest.hasMultiFragment(),false);
    }

}