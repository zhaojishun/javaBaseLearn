package cn.zhaojishun;

import java.util.Scanner;

/**
 * @program: javaBaseLearn
 * @description:
 * @author: Jishun Zhao
 * @create: 2020-05-14 14:43
 */
public class TestFraction {
    public  static  void  main(String[]  args)  {
        Scanner  sc  =  new Scanner(System.in);
        int  fz,  fm;
        System.out.println("first  number,fenzi  fenmu");
        fz  =  sc.nextInt();
        fm  =  sc.nextInt();
        Fraction  f1  =  new  Fraction(fz,  fm);
        System.out.println("second  number,fenzi  fenmu");
        fz  =  sc.nextInt();
        fm  =  sc.nextInt();
        Fraction  f2  =  new  Fraction(fz,  fm);
        System.out.println("first  Fraction:"  +  f1);
        System.out.printf("first  output  as  double:%.2f\n",  f1.toDouble());
        System.out.println("second  Fraction:"  +  f2);
        System.out.printf("second  output  as  double:%.2f\n",  f2.toDouble());
        System.out.println("result  of  two  Fraction  add:"  +  f1.add(f2));
        System.out.println("result  of  two  Fraction  multiply:"  +  f1.multiply(f2));
        sc.close();
    }

}