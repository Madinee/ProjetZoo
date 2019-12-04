package zoo;

import java.util.ArrayList;
import java.util.List;

public class App {

	
	public static void main(String[] args) throws LimiteVisiteException
	{
		Chien chien1=new Chien("", TypeAnimal.Chien);
		Chien chien=new Chien("lll", TypeAnimal.Chien);
	List<Animal> animal=new ArrayList<Animal>();{
		animal.add(chien);
		animal.add(chien1);		
		System.out.println(animal.toString());
		
		Secteur s1= new Secteur(TypeAnimauxDansSecteur.Chien, animal);
		System.out.println(s1.toString());
		
	}
		

}
}