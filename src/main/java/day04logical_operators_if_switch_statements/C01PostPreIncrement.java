package day04logical_operators_if_switch_statements;

public class C01PostPreIncrement {
    public static void main(String[] args) {
        //Post Increment
        int a = 12;
        int b = a++; // ++ ==> +1
        System.out.println(a); // 13
        System.out.println(b); // 12 // önce atama işlemi yapar b=12 sonra arttırır a=13

        double x = 11.5;
        double y = x++;  //önce atama işlemi yapar y=11.5 sonra arttırır x=12.5
        System.out.println(x); // 12.5
        System.out.println(y); // 11.5

        //Pre Increment
        int t = 10;
        int u = ++t;
        System.out.println(t);// 11
        System.out.println(u);// 11 //önce artırır t= 11 olur sonra atama işlemi yapar u=11 olur

        //Post Decrement
        int c = 15;
        int d = c--;
        System.out.println(c);//14
        System.out.println(d);//15

        //Pre Decrement
        int e = 20;
        int f = --e;
        System.out.println(e);//19
        System.out.println(f);//19
    }

}
