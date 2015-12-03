package day5;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<>();
		l.add("selenium");
		l.add("QTP");
		l.add("lr");
		
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}

	}

}
