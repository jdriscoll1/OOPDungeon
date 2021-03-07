//This creates new factories 
public class CharacterFactoryProducer {
	//It has one method that takes an input and returns an abstract factory 
	public static AbstractCharacterFactory createFactory(int characterID) {
		//Monsters are created through negative numbers
		//Heros are created using positive numbers 
		if(characterID > 0) {
			return new HeroFactory(); 
		}
		return new MonsterFactory(); 
	}
}
