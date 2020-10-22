class Fib
{
public static void main(String args[])
{
int F1=1,F2=1,F3,count=2,sum=0;
double p;
System.out.print(F1+" ");
System.out.print(F2+" ");
while(count!=20)  
{
F3=F1+F2;
System.out.print(F3+" ");
sum=F3+sum;
F1=F2;
F2=F3;
count++;
}
p=sum/20;
System.out.println();
System.out.println("The average is " +p +"");
}
}