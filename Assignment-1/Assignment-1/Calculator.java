// calculator

 import java.util.*;

public class Calculator{

public static int add(int a, int b){
return a+b;
}

public static int sub(int a, int b){
return a-b;
}

public static int  multi(int a, int b){
return a*b;
}

public static int divi(int a, int b){
return a/b;
}

public static int  remain(int a, int b){
return a%b;
}

public static int  square(int a, int b){
return a*a;
}


public static void main(String [] args){
System.out.print("enter two numbers");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.print(add(a,b));
System.out.print(sub(a,b));
System.out.print(multi(a,b));
System.out.print(divi(a,b));
System.out.print(remain(a,b));
System.out.print(square(a,b));
}
}