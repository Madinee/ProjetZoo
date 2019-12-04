package zoo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Animal {

	private static final Logger logger =
			LogManager.getLogger ( Animal.class );
	public Animal(String nomAnimal, TypeAnimal typeAnimal) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		//logger.info=msg d'information
		logger.info ("nom de l'animal "+ nomAnimal);
		logger.info ("type de l'animal "+ typeAnimal);
		//logger.warn=msg d'avertissement
		if(this.nomAnimal.equals("") || this.typeAnimal.equals(""))
			logger.warn("attention l'animal n'a pas de nom ou de type");
		//logger.error=message d'erreur
		if(this.nomAnimal==null || this.typeAnimal==null)
			logger.error("attention l'animal n'a pas de nom ou de type");
		
		
	}
	private String nomAnimal;
	private TypeAnimal typeAnimal;
	
	public String getNomAnimal() {
		return nomAnimal;
	}
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	@Override
	public String toString() {
		return "Animal [nomAnimal=" + nomAnimal + ", typeAnimal=" + typeAnimal + "]";
	}
	
	
}
