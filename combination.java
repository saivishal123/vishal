class combination
{
static int ncr(int n,int r)
{
return fact(n)/(fact(r)*fact(n-r));
}
static int fact(int n)
{
int r=1;
for(int i=2;i<n;i++)
r=r*i;
return r;
}
public static void main(String arg[])
{
int n=5;
int r=3;
System.out.println(ncr(n,r));
}
}