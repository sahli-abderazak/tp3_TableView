package application;

public class Person {
	private String nom;
	private String prenom;
	private String email;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [nom=" + nom + ", prenom=" + prenom  + ", email=" + email + "]";
	}
}
