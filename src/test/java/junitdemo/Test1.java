package junitdemo;

import org.junit.*;

public class Test1 {
    @BeforeClass
    public static  void beforeClass(){
        System.out.println("this is Test1 beforeClass");
    }

    @Before
    public void before(){
        System.out.println("this is Test1 before");
    }
    @Test
    public void fun1(){
        //System.out.println(5/0);
        //System.out.println(0/5);
        //Assert.assertEquals(0,3);
    }

    @Test
    public void fun2(){
        System.out.println("this is Test1 fun2");
    }



    @After
    public void after(){
        System.out.println("this is Test1 after");

    }
    @AfterClass
    public static  void afterClass(){
        System.out.println("this is Test1 afterClass");
    }
}
