package newproj;

import java.util.ArrayList;
import java.util.List;

public class mypkg {
	static List<String> places = new ArrayList<>();
	public static List getPlaces() {
		places.add("nepal,kathmandu");
		places.add("nepal,pokhara");
		places.add("india,delhi");
		places.add("US,new york");
		
		return places;
	}
	public static void main(String[]args) {
		List<String> myplaces = getPlaces();
		System.out.println("Places from nepal");
		
		myplaces.stream()
		.filter((p) -> p.startsWith("nepal"))  //retrieve required data
		.map((p) -> p.toUpperCase())  //perform manipulation
		.sorted()  //apply ordering
		.forEach((p) -> System.out.println(p));  //traversing/printing
	}
}
