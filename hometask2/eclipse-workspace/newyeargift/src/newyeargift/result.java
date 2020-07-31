package newyeargift;
import java.util.Scanner;
import java.util.TreeSet;
public class result {
	public static void main(String args[])
	{
		TreeSet<Integer> s1=new TreeSet<>();
	    TreeSet<Integer> s2=new TreeSet<>();
		Scanner in=new Scanner(System.in);
		int nocandies=in.nextInt();
		int nochoco=in.nextInt();
		int sorttype=in.nextInt();
		for(int i=0;i<nocandies;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			candies c=new candies(x,y);
			if(sorttype==1)
			{
				s1.add(c.x);
			}
			else
			{
				s2.add(c.y);
			}
		}
		for(int i=0;i<nochoco;i++);
		{
			int x=in.nextInt();
			int y=in.nextInt();
			chocolates co=new chocolates(x,y);
			if(sorttype==1)
			{
				s1.add(co.x);
			}
			else
			{
				s2.add(co.y);
			}
		}
		int lower=in.nextInt();
		int higher=in.nextInt();
		/*Iterator<Integer> itr=s1.iterator();
		Iterator<Integer> itr1=s2.iterator();*/
		if(sorttype==1)
		{
			for(Integer v:s1)
			{
				if(v>=lower && v<=higher)
					System.out.println(v);
			}
		}
		else
		{
			for(Integer v1:s2)
			{
				if(v1>=lower && v1<=higher)
					System.out.println(v1);
			}
		}
		in.close();
	}
}
