package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marque")
public class Marque {
	
	private int id;
	private String nom;

	public Marque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Marque(String nom) {
		super();
		this.nom = nom;
	}

	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	
	
	@Column(name = "NOM")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Marque [nom=" + nom + "]";
	}
	
	
}
