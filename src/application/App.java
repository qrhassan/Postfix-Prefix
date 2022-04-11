package application;

public class App {

	public static void main(String[] args) {
		
		int Cats = 5;
		System.out.println(Cats);
		System.out.println(Cats++);
		System.out.println(++Cats);

		int Dogs = 4;
		System.out.println(Dogs);
		System.out.println(++Dogs);
		System.out.println(Dogs++);
		
		int giraffes = 10;
		int  animals = Cats + giraffes++;
		System.out.println(animals);
		
		
		int apples = 5;
		int oranges = 6;
		int fruits = ++apples + oranges++;
		System.out.println(fruits);
		
		
		int DellLaptop = 8;
		int DellDocking = 6;
		int DellMonitor = 10;
		int TotalDellItems = DellLaptop + DellDocking++ + ++DellMonitor;
		System.out.println(TotalDellItems);
	}

}
