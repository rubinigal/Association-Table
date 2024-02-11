
public class Student implements Comparable<Student> {
	private String name;
	private String familyName;
	private int id;
	private int yearDate;
	
	public Student(String name, String familyName, int id, int yearDate) {
		this.name = name;
		this.familyName = familyName;
		this.id = id;
		this.yearDate = yearDate;
	}
	
	@Override
	public int compareTo(Student o) {
		return this.id - o.id;
	}
	
    public String toString() {
        return  "Name: " + name +
                "| Family Name: " + familyName +
                "| Id: " + id +
                "| Year of Date: " + yearDate;
    }
}
