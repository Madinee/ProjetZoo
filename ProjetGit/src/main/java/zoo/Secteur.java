package zoo;
import java.util.ArrayList;
import java.util.List;
import org. apache . logging . log4j . LogManager ;
import org. apache . logging . log4j . Logger ;
public class Secteur {
	private static final Logger logger =
			LogManager.getLogger ( Secteur.class );
	
	private TypeAnimauxDansSecteur typeAnimauxDansSecteur;
	private List<Animal> animauxDAnsSecteur=new ArrayList<Animal>();
	
	public Secteur(TypeAnimauxDansSecteur typeAnimauxDansSecteur, List<Animal> animauxDAnsSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		this.animauxDAnsSecteur = animauxDAnsSecteur;
		logger.info (" Nouveau secteur type "+ typeAnimauxDansSecteur);
	}
	
	
	public TypeAnimauxDansSecteur getTypeAnimauxDansSecteur() {
		return typeAnimauxDansSecteur;
	}
	public void setTypeAnimauxDansSecteur(TypeAnimauxDansSecteur typeAnimauxDansSecteur) {
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
	}
	public List<Animal> getAnimauxDAnsSecteur() {
		return animauxDAnsSecteur;
	}
	public void setAnimauxDAnsSecteur(List<Animal> animauxDAnsSecteur) {
		this.animauxDAnsSecteur = animauxDAnsSecteur;
	}
	
	public void ajouterAnimal(Animal animal)
	{
		animauxDAnsSecteur.add(animal);
	}
	
	public int getNombreAnimaux()
	{
		return animauxDAnsSecteur.size();
	}


	@Override
	public String toString() {
		return "Secteur [typeAnimauxDansSecteur=" + typeAnimauxDansSecteur + ", animauxDAnsSecteur="
				+ animauxDAnsSecteur + "]";
	}
	
	

}
