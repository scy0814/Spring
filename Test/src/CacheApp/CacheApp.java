package CacheApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacheApp {
	public static void main(String[] args) {
		List<String> cities = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("dd : ");
		int chacheSize = scanner.nextInt();

		System.out.println("dd ,) :");
		Scanner sc1 = new Scanner(scanner.next()).useDelimiter("\\s*,\\s*");
		while (sc1.hasNext()) {
			cities.add(sc1.next());
		}
		System.out.println(cities);

		LRUSchedule LRUSched = new LRUSchedule(chacheSize, cities);
		System.out.println(LRUSched.getRunTime());
	}
}
