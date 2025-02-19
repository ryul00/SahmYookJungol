package q618;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력
		List<Person> people = new ArrayList<Person>();
		for(int i=0;i<5;i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			people.add(new Person(name, height, weight));  
		}
		sc.close();
		
		
        Collections.sort(people, Person.nameComparator);
        System.out.println("name");
        for (Person p : people) {
            System.out.println(p.name + " " + p.height + " " + p.weight);
        }
		
		System.out.println("weight");
		Collections.sort(people,Person.weightComparator);
        for (Person p : people) {
        	System.out.println(p.name + " " + p.height + " " + p.weight);
        }

		
	}

}

class Person{
	String name;
	int height;
	double weight;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
    
    public static Comparator<Person> nameComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.name.compareTo(p2.name);
        }
    };
    
    public static Comparator<Person> weightComparator = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Double.compare(p2.weight, p1.weight);  // 내림차순
        }
    };
    
//    @Override
//    public String toString() {
//        return String.format("%s %.0f %.1f", name, height, weight);
//    }
//	
	
}













