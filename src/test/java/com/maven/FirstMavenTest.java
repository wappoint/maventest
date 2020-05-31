package com.maven;

import org.junit.Before;
import org.junit.Test;

/**
 * @author George Jia
 * @email 676002187@qq.com
 * @date 2020-05-30 21:55:51
 */
public class FirstMavenTest {

    @Before
    public void testBefore(){
        System.out.println("the before test ... ");
    }

    @Test
    public void testFirstMaven(){
        System.out.println("the first maven demo . ");
    }

}
