package introSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		regular();
//		streamFilter();
//		streamFilter2();
//		streamFilter3();
//		streamFilter4();
//		streamFilter5();
//		streamFilter6();
		streamFilter7();
	}
	
	
	public static void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Donna");
		names.add("Abhay");
		names.add("Alice");
		names.add("Ram");
		
		int j= 0 ; 
		for(int i=0; i<names.size();i++) {
		  String val=   names.get(i);
		  System.out.println(val);
		  if(val.startsWith("A")) {
			  j++;
		  }
		}
		System.out.println("j = " + j);
	}

	
	public static void streamFilter() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Donna");
		names.add("Abhay");
		names.add("Alice");
		names.add("Ram");
		
		long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);
	}
	
	
public static void streamFilter2() {
		
		
		long c = Stream.of("Abhijeet","Donna","Abhay","Alice","Ram").filter(s -> s.startsWith("A")).count();
		System.out.println(c);
		
	}

public static void streamFilter3() {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Donna");
	names.add("Abhay");
	names.add("Alice");
	names.add("Ram");
	
	 names.stream().filter(s -> s.length() > 4).forEach(v-> System.out.println(v));


	
	
}

public static void streamFilter4() {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Donna");
	names.add("Abhay");
	names.add("Alice");
	names.add("Ram");
	
	 names.stream().filter(s -> s.length() > 4).limit(2).forEach(v-> System.out.println(v));


	
	
}

public static void streamFilter5() {
	
	
	Stream.of("Abhijeet","Donna","Abhay","Alice","Ram").filter(s -> s.startsWith("A")).map(v->v.toUpperCase()).forEach(n-> System.out.println(n));;
	
	
}

public static void streamFilter6() {
	
	
	Stream.of("Abhijeet","Donna","Abhay","Alice","Ram").filter(s -> s.startsWith("A")).sorted().map(v->v.toUpperCase()).forEach(n-> System.out.println(n));
	
	
}
	
public static void streamFilter7() {
	
	
	List<String> ans = Stream.of("Abhijeet","Donna","Abhay","Alice","Ram").filter(s -> s.startsWith("A")).sorted().map(v->v.toUpperCase()).collect(Collectors.toList());
	System.out.println(ans.get(0));
	
	
}

}
