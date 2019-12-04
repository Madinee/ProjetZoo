package zoo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ApiComparatorTest {

	@Test
	public void test() {
		ApiComparator ac= new ApiComparator();
		Chien chien1=new Chien("kkk", TypeAnimal.Chien);
		Chien chien=new Chien("lll", TypeAnimal.Chien);
		Chat chat= new Chat("milou", TypeAnimal.Chien);
		
		List<Animal> animal=new ArrayList<Animal>();
		animal.add(chien);
		animal.add(chien1);
		
		List<Animal> animalChat=new ArrayList<Animal>();
		animalChat.add(chat);
		
		
		Secteur s1= new Secteur(TypeAnimauxDansSecteur.Chien, animal);
		Secteur s2=new Secteur(TypeAnimauxDansSecteur.Chat, animalChat);
		
		int result=ac.compare(s1,s2);
		assertEquals(1, result);// s1 superieur à s2
	
		
		
	}

}
