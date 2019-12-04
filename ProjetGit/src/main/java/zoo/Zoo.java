package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private int visiteur;
	private List<Secteur> secteursAnimaux= new ArrayList<Secteur>();
	public int getVisiteur() {
		return visiteur;
	}
	public void setVisiteur(int visiteur) {
		this.visiteur = visiteur;
	}
	public List<Secteur> getSecteursAnimaux() {
		return secteursAnimaux;
	}
	public void setSecteursAnimaux(List<Secteur> secteursAnimaux) {
		this.secteursAnimaux = secteursAnimaux;
	}
	public Zoo(int visiteur, List<Secteur> secteursAnimaux) {
		super();
		this.visiteur = visiteur;
		this.secteursAnimaux = secteursAnimaux;
	}
	public void addSecteur( Secteur secteur)
	{
		secteursAnimaux.add(secteur);
	}
	public int getLimiteVisiteur() throws LimiteVisiteException
	{
		if(this.visiteur>=secteursAnimaux.size()*15)
			throw new LimiteVisiteException();
		return this.visiteur;
	}
	
	public void nouvelAnimal()
	{
		
	}
	public void nouveauVisiteur() throws LimiteVisiteException
	{
		visiteur++;
		getLimiteVisiteur();
	}
	
	public int nombreAnimaux()
	{
		int n=0;
		for(int i=0; i<secteursAnimaux.size(); i++)
			i+=secteursAnimaux.get(i).getNombreAnimaux();
		return n;
	}
	

}
