package com.basics.pro;

import java.util.Scanner;
class Circle
{
public static void main(String arg[])
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter radius of your Circle");
double r=sc.nextDouble();
double ar=3.143*r*r;
System.out.println(r+"radius circle area is "+ar);
}
}