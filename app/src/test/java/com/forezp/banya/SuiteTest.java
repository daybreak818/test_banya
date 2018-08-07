package com.forezp.banya;
import android.app.Instrumentation;

import com.forezp.banya.api.ApiFactory;
import com.forezp.banya.api.DoubanApi;
import com.forezp.banya.api.BookApiUtilsTest;
import com.forezp.banya.api.MusicApiUtilsTest;
import com.forezp.banya.viewimpl.book.BookFragmentTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
/**
 * Created by 王诗璇 on 2018/8/7.
 */
@RunWith(Suite.class)//声明套件运行器
@SuiteClasses({BookApiUtilsTest.class,MusicApiUtilsTest.class,BookFragmentTest.class})

public class SuiteTest {

}