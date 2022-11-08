package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {
	
	
	
	
	 private int id;
	 private String nom;
	    private Categorie categorie;
	    private Marque marque;
	    private String scoreNutritionnel;
	    private String attributs;
	    private List<Additif> lstAdditif;
		private List<Ingredient> lstIngredient;
	    private List<Allergene> lstAllergene;
    
 
	    public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}




	    public Produit(String nom, Categorie categorie, Marque marque, String scoreNutritionnel,
				Map<String, String> lstAttributs, List<Ingredient> lstIngredient, List<Additif> lstAdditif,
				List<Allergene> lstAllergene) {
			super();
			this.nom = nom;
			this.categorie = categorie;
			this.marque = marque;
			this.scoreNutritionnel = scoreNutritionnel;
			this.attributs = attributs;
			this.lstIngredient = lstIngredient;			
			this.lstAllergene = lstAllergene;
		
	    }

		@Column(name = "SCORE_NUT")

		public String getScoreNutritionnel() {
			return scoreNutritionnel;
		}
		public void setScoreNutritionnel(String scoreNutritionnel) {
			this.scoreNutritionnel = scoreNutritionnel;
		}



		@Column(name = "ATTRIBUTS",length=1000)
		public String getAttributs() {
			return attributs;
		}
		public void setAttributs(String attributs) {
			this.attributs = attributs;
		}



		@ManyToMany(cascade = {CascadeType.ALL})
		 @JoinTable(name="produit_ingredient",
		 joinColumns= @JoinColumn(name="ID_PRODUIT", referencedColumnName="ID"),
		 inverseJoinColumns= @JoinColumn(name="ID_INGREDIENT", referencedColumnName="ID"))
		public List<Ingredient> getLstIngredient() {
			return lstIngredient;
		}
		public void setLstIngredient(List<Ingredient> lstIngredient) {
			this.lstIngredient = lstIngredient;
		}



		@ManyToMany(cascade = {CascadeType.ALL})
		 @JoinTable(name="produit_allergene",
		 joinColumns= @JoinColumn(name="ID_PRODUIT", referencedColumnName="ID"),
		 inverseJoinColumns= @JoinColumn(name="ID_ALLERGENE", referencedColumnName="ID"))
		public List<Allergene> getLstAllergene() {
			return lstAllergene;
		}
		public void setLstAllergene(List<Allergene> lstAllergene) {
			this.lstAllergene = lstAllergene;
		}

		@ManyToMany(cascade = {CascadeType.ALL})
		 @JoinTable(name="produit_additif",
		 joinColumns= @JoinColumn(name="ID_PRODUIT", referencedColumnName="ID"),
		 inverseJoinColumns= @JoinColumn(name="ID_ADDITIF", referencedColumnName="ID"))
		  public List<Additif> getLstAdditif() {
				return lstAdditif;
			}
			public void setLstAdditif(List<Additif> lstAdditif) {
				this.lstAdditif = lstAdditif;

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
		

		 @OneToOne	    
		    @JoinColumn(name = "ID_CATEQORIE")
		public Categorie getCategorie() {
			return categorie;
		}
		public void setCategorie(Categorie categorie) {
			this.categorie = categorie;
		}



		@OneToOne	
		@JoinColumn(name = "ID_MARQUE")
		public Marque getMarque() {
			return marque;
		}
		public void setMarque(Marque marque) {
			this.marque = marque;
		}


		
		
		
		
	 
}
