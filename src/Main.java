import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<Integer> grades = new ArrayList<>();
		AssociationTable<Student, Integer> table = new AssociationTable<>();
		Student s1,s2,s3,s4;
		
		s1 = new Student("Yossi", "Tov", 5678, 1996);
		s2 = new Student("Mor", "Mizrahi", 5901, 1997);
		s3 = new Student("Igal", "Rubin", 3270, 1995);
		s4 = new Student("Yana", "Yanovski", 3256, 1978);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		grades.add(88);
		grades.add(92);
		grades.add(67);
		
		try {
			table = new AssociationTable<>(students, grades);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Testing AssociationTable functions
		print(table);
		table.add(s4, 61);
		print(table);
		table.add(s4, 72);
		print(table);
		table.remove(s3);
		print(table);
	}
	
	private static void print(AssociationTable<Student, Integer> table) {
		Iterator<Student> keyIterator = table.keyIterator();

        while (keyIterator.hasNext()) {
        	Student key = keyIterator.next();
            System.out.println("Student: " + key + " | Average Grade: " + table.get(key));
        }
        System.out.println();
	}
}
