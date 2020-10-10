package Lab3;

import java.util.*;
public class q1
{
private int base,height;
public q1(int b,int h)
{
base=b; height=h;
if(b<=0||h<=0)
{
System.out.println("Error - base / height cannot be 0 or negative");
System.exit(0);
}
}
double getArea()
{
return base*height/2;
}
void show()
{
double ar=getArea();
System.out.println("Dimensions: "+base+" "+height+" , Area : " +getArea());
}
void compare( q1 t1,q1 t2)
{
double a1=t1.getArea();
double a2=t2.getArea();
if(Double.compare(a1,a2)>0 )
{
System.out.println("t1 is larger");
}
if(Double.compare(a1,a2)==0 )
{
System.out.println("t1 and t2 are equal");
}
if(Double.compare(a1,a2) <0 )
{
System.out.println("t2 is larger");
}
}
public static void main(String args[])
{
int ch ,b,h,b1,h1,b2,h2;
Scanner sc=new Scanner(System.in);
do{
System.out.println("1: Give dimensions to evaluate area of a triangle");
System.out.println("2: Compare Area of two triangles");
System.out.println("3: quit");
ch=sc.nextInt();
switch (ch)
{
case 1:
System.out.println("Base: ");
b=sc.nextInt();
System.out.println("Height: ");
h=sc.nextInt();
q1 t=new q1(b,h) ;
t.getArea();
t.show();
break;
case 2: System.out.println("Give dimensions for first triangle");
System.out.println("t1 base: ");
b1=sc.nextInt();
System.out.println("t1 height: ");
h1=sc.nextInt();
q1 t1=new q1(b1,h1) ;
System.out.println("Give dimensions for second triangle ");
System.out.println("t2 base: ");
b2=sc.nextInt();
System.out.println("t2 height: ");
h2=sc.nextInt();
q1 t2=new q1(b2,h2) ;
t1.compare(t1,t2);
break;
case 3: System.out.println("Program terminating");
break;
default: System.out.println("Invlid choice");
break;
}
 } while (ch!= 3);
 }
}