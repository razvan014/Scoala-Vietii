package scoala;

public class Adresa {

	String strada;
	int numar;
	String oras;

	public Adresa(String strada, int numar, String oras) {
		super();
		this.strada = strada;
		this.numar = numar;
		this.oras = oras;
	}

	@Override
	public String toString() {
		return "Adresa [strada=" + strada + ", numar=" + numar + ", oras=" + oras + "]";
	}

}
