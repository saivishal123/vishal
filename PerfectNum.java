class PerfectNum
{
public static void main(String ar[])
{
int n=6;
int i,s=0;
for (i=1;i<n;i++)
{
if((n%i)==0)
s+=i;
}
if (s==n)
System.out.println(n+"is a Perfect Num");
else
System.out.println(n+"is not a Perfect Num");
}
}