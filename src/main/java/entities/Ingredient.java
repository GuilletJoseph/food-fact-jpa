package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ingredient")
public class Ingredient {

	/**
	 * Nom de l'ingredient
	 */
	
	
	
	
	private int id;
	
	private String libelle;

	/**
	 * 
	 * @param libelle Nom de l'ingredient
	 *
	 */
	
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	
	public Ingredient(String libelle) {
		this.libelle = libelle;
	}

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name = "LIBELLE",length=512)
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
