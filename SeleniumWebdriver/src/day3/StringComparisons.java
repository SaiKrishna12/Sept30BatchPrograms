package day3;

public class StringComparisons {

	public static void main(String[] args) {
		String x="Qedge";
		String y="Qedge";
		if(x.equals(y))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		
		String a="Qedge";
		String b="qedge";
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		
		String i="Software Testing";
		String j="Testing";
		if(i.contains(j))
		{
			System.out.println("String is present");
		}
		else
		{
			System.out.println("String is not present");
		}
	}
}

