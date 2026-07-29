
impot java.io.*;
class demo
{
void getdata(int x,int y)
{
a=x;
b=y;
}
void putdata()
{
system.out.println("a="+a);
system.out.println("b="+b);
}
}
class demo1
{
public static void main(sting args[])
{
demo d=new demo();
d.getdata(30,40);
d.putdata();
}
}