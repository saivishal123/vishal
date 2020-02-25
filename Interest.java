class Interest
{
public static void main(String arg[])
{
double p,r,t,si,ci;
Interest int=newInterest();
System.out.println("Enter the amount");
p=int.nextdouble();
System.out.println("Enter the years");
t=int.nextdouble();
System.out.println("Rate of interest");
r=int.nextdouble();
si=(p*t*r)/100;
ci=p*Math.pow(1+r/100,t)-p;
System.out.println("Simple interest"=+si);
System.out.println("Compound interest"=+ci);
}
}