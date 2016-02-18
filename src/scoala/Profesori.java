package scoala;

public class Profesori {
	
	String nume;
	String materia;
	
	public Profesori(String nume, String materia) {
		super();
		this.nume = nume;
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesori [nume=" + nume + ", materia=" + materia + "]";
	}

	
}
