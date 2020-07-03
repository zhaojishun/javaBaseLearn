package cn.zhaojishun;



/**
 * @program:
 * @description:
 * @author:
 * @create: 2020-05-14 14:14
 */
public class Fraction {

    //分子
    int a;

    //分母
    int b;

    Fraction(){}

    /*构造方法*/
    Fraction(int denominator , int numerator){
        int smaller = numerator>denominator?numerator:denominator;
        int maxCommonFactor = 1;
        for (int i = 1; i <= smaller; i++) {
            if(numerator%i==0 && denominator%i==0){
                maxCommonFactor = i;
            }
        }

        a = denominator/maxCommonFactor;
        b = numerator/maxCommonFactor;
    }

    /*分数相加*/
    public Fraction add(Fraction r) {
        Fraction temp = new Fraction();
        temp.b = this.b * r.b;
        temp.b = temp.b/GCD(this.b, r.b);
        temp.a = (this.a*(temp.b/this.b) + r.a*(temp.b/r.b));
        return temp;
    }


    public double toDouble() {
        return(float)a/b;
    }

    @Override
    public String toString() {
        return a+"/"+b;
    }

    public int GCD(int a, int b){
        //辗转相除法求最大公约数
        int temp;
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public Fraction multiply(Fraction r){
        Fraction temp = new Fraction((this.a*r.a), (this.b*r.b));
        return temp;
    }
}