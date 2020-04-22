package ru.gb.java_3.hw_6.Test;
import org.junit.*;

import ru.gb.java_3.hw_6.TestArrays;

public class ArrayTest {
    TestArrays ta;
    @Before
    public void init(){
        ta = new TestArrays();
    }

    @Test
    public void test1(){
        Assert.assertArrayEquals(new int[]{1, 7}, ta.ReturnArr(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void test2(){
        Assert.assertArrayEquals(new int[]{0, 2, 1, 3, 7, 2, 99, 1}, ta.ReturnArr(new int[]{2, 4, 0, 2, 1, 3, 7, 2, 99, 1}));
    }

    @Test(expected = RuntimeException.class)
    public void test3(){
        Assert.assertArrayEquals(new int[0], ta.ReturnArr(new int[]{22, 99, 1, 3, 2, 3, 5, 1, 6}));
    }

    @Test(expected = RuntimeException.class)
    public void test4(){
        Assert.assertArrayEquals(new int[0], ta.ReturnArr(new int[]{}));
    }
}
