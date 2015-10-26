package aufgabenblatt1;

import java.util.List;

public class Student implements Comparable<Student>{
	
	private String vorname;
	private String name;
	private int matrikelnummer;
	private List<Pruefungsleistung> pruefungsleistungen;
	
	public Student(String vorname, String name, int matrikelnummer, List<Pruefungsleistung> pruefungsleistungen) {
		super();
		this.setVorname(vorname);
		this.setName(name);
		this.setMatrikelnummer(matrikelnummer);
		this.setPruefungsleistungen(pruefungsleistungen);
	}

	@Override
	public int compareTo(Student other) {
		if (getMatrikelnummer() > other.getMatrikelnummer()) {
			return 1;
		} 
		else if (getMatrikelnummer() < other.getMatrikelnummer()) {
			return -1;
		} 
		else {
			return 0;
		}
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatrikelnummer() {
		return matrikelnummer;
	}

	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}

	public List<Pruefungsleistung> getPruefungsleistungen() {
		return pruefungsleistungen;
	}

	public void setPruefungsleistungen(List<Pruefungsleistung> pruefungsleistungen) {
		this.pruefungsleistungen = pruefungsleistungen;
	}
	
	public boolean equals(Student other) {
		return getMatrikelnummer() == other.getMatrikelnummer();
	}
	
	@Override
    public int hashCode() {
		return getMatrikelnummer();
	}
	
	public String toString() {
		return (this.getName() + "," + this.getVorname());
	}
}