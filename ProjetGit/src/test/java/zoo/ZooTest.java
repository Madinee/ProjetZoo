package zoo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class ZooTest {


	/*
	 * les données de test
	 */
	static Zoo zoo;
	static Secteur s1, s2, s3;
	static Animal a1, a2;
	static List<Animal> animal;
	static ArrayList<Secteur> liste;
	/*
	 * initialisation des données de test avant l'ensemble des tests
	 */
	@BeforeClass
	public static void initTest()
	{
		a1=new Chien("pikou", TypeAnimal.Chien);
		a2=new Chat("milou", TypeAnimal.Chat);
		
		animal=new ArrayList<Animal>();
		animal.add(a1);
		animal.add(a2);
		s1= new Secteur(TypeAnimauxDansSecteur.Chien, animal);
		liste.add(s1);
		zoo=new Zoo(14,liste);
	}
	@Test
	public void nbVisiteurAutoriser() throws LimiteVisiteException {
		int nb=zoo.getLimiteVisiteur();
		assertEquals(14,nb);
	}


}
