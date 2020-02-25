public class fib
{
public static void main(String arg[])
{
int a=5,F=0,S=1,next,i;
System.out.println(F);
System.out.println(S);
for(i=1;i<=a-2;i++);
{
next=F+S;
S=next;
F=S;
System.out.println(next);
}
}
}