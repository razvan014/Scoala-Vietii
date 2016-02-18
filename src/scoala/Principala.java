package scoala;

public class Principala {

	public static void main(String[] args) {


		Scoala scoala = new Scoala("Geo Bogza", 300, 7);
		Adresa adresaScoala = new Adresa("Barbu Lautaru ", 2, "Bucuresti");
		
		Profesori profesor1 = new Profesori("Gheorghe Gheorghiu", "Matematica");
		Profesori profesor2 = new Profesori("Panseluta Roz", "Romana");
		Profesori profesor3 = new Profesori("Bogdanel Hurezeanu", "Biologie");
		Profesori profesor4 = new Profesori("Zambil Muresan", "Romana");
		Profesori director = profesor4;
		
		
		
		System.out.println("Numele scolii este " + scoala.denumire);
		System.out.println("Numarul elevilor al scolii " + scoala.denumire + " este de " + scoala.nrElevi );
		System.out.println("Numarul de sali al scolii " + scoala.denumire + " este de " + scoala.nrSali );
		System.out.println("Strada pe care se afla scoala " + scoala.denumire + " este " + adresaScoala.strada);
		System.out.println("Numele primului profesor al scolii " + scoala.denumire + " este " + profesor1.nume);
		System.out.println("Materia celui de-al doilea profesor este " + profesor2.materia );
		System.out.println("Materia pe care o preda directorul scolii este " + director.materia);
		System.out.println("Numele profesorului de matematica al scolii " + scoala.denumire + " este " + profesor1.nume);
		System.out.println();
		System.out.println();

		
		
		
		Scoala scoala2 = new Scoala("Traian", 500, 9);
		Adresa adresaScoala2 = new Adresa("Copacul Drept ", 69, "Bucuresti");
		
		Profesori profesorunu = new Profesori("Dan Daniel", "Limbi");
		Profesori profesordoi = new Profesori("Jean Craioveanu", "Labii");
		Profesori profesortrei = new Profesori("Stefanel Prapure", "Biologie");
		Profesori profesorpatru = new Profesori("Vasile Vasilescu", "Romana");
		Profesori directorunu = profesorpatru;
		
		
		System.out.println("Numele scolii este " + scoala2.denumire);
		System.out.println("Numarul elevilor al scolii " + scoala2.denumire + " este de " + scoala2.nrElevi );
		System.out.println("Numarul de salilor al scolii " + scoala2.denumire + " este de " + scoala2.nrSali );
		System.out.println("Strada pe care se afla scoala " + scoala2.denumire + " este " + adresaScoala2.strada);
		System.out.println("Numele primului profesor al scolii " + scoala2.denumire + " este " + profesorunu.nume);
		System.out.println("Materia celui de-al doilea profesor este " + profesordoi.materia );
		System.out.println("Materia pe care o preda directorul scolii este " + directorunu.materia);
		System.out.println("Numele profesorului de matematica al scolii " + scoala2.denumire + " este " + profesorunu.nume);
		
		//Acest rand este nou
		System.out.println("Randul lui Vlad !!!");
		
		System.out.println("Am adaugat un nou rand de test");
	}

}
