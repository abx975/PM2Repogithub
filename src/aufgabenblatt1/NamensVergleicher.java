package aufgabenblatt1;

import java.util.Comparator;

public class NamensVergleicher implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return (s1.toString().compareToIgnoreCase(s2.toString()));
	}
	
}