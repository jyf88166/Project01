package com.idea.bean;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author jyf
 * @create 2022-04-24-8:14 下午
 */
public class TemplatesTest {

    //模版六：prsf ：可生成private static final
    private static final Person PROJECT_01 = new Person();//常量一般大写
    //变形：psf ：可生成public static final
    public static final int NUM = 1;
    //变形：psfi ：可生成public static final int
    public static final int NUM2 = 2;
    //变形：psfs ：可生成public static final String
    public static final String NATION = "china";


    //模版一：psvm
    public static void main(String[] args) {

        //模版二：sout
        System.out.println("hello");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));//soutp
        System.out.println("TemplatesTest.main");//soutm

        int num1 = 10;
        System.out.println("num1 = " + num1);//soutv
        int num2 = 20;
        int num3 = 30;
        System.out.println("num3 = " + num3);
        System.out.println(num2);//num2.sout

        //模版三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("fori.arr[i]:" + arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println("iter.s:" + s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("itar.s:" + s);
        }

        //模版四：list.for
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(456);
        integers.add(789);
        //integers.for
        for (Integer integer : integers) {
            
        }
        //变形：integers.fori
        for (int i = 0; i < integers.size(); i++) {

        }
        //变形：integers.forr 倒序遍历
        for (int i = integers.size() - 1; i >= 0; i--) {

        }

        //模版五：ifn
        if (integers == null) {

        }
        //变形：inn
        if (integers != null) {

        }
        //变形：xxx.null
        //integers.null
        if (integers == null) {

        }
        //变形：xxx.nn
        //integers.nn
        if (integers != null) {

        }

    }
}
