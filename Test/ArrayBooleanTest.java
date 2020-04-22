package ru.gb.java_3.hw_6.Test;
import org.junit.*;
import ru.gb.java_3.hw_6.TestArrays;
public class ArrayBooleanTest {
    TestArrays ta;
    @Before
    public void init(){
        ta = new TestArrays();
    }

    @Test
    public void test1(){
        Assert.assertFalse(ta.CheckArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test2(){
        Assert.assertFalse(ta.CheckArr(new int[]{0, 2, 3, 0, 5, 6, 7, 8}));
    }

    @Test
    public void test3(){
        Assert.assertFalse(ta.CheckArr(new int[]{1}));
    }

    @Test
    public void test4(){
        Assert.assertFalse(ta.CheckArr(new int[]{}));
    }
}
