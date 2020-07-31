package oops_concepts;
interface phone
{
	public void phonecom();
}
class samsung implements phone 
{
	int a=10;
	public void phonecom()
	{
		System.out.println("samsung");
	}
	public void print()
	{
		System.out.println(a);
	}
}
class oneplus implements phone
{
	public void phonecom()
	{
		System.out.println("one plus");
	}
}
class compilepolymor
{
	static int mul(int a,int b)
	{
		return a*b;
	}
	static int mul(int a,int b,int c)
	{
		return a*b*c;
	}
}
public class object_oriented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compilepolymor.mul(2,3));
		System.out.println(compilepolymor.mul(2,3,4));
		samsung s=new samsung();
		s.phonecom();
		oneplus o=new oneplus();
		o.phonecom();
	}

}
