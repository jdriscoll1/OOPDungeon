//This is the factory that creates hero characters 
public class HeroFactory implements AbstractCharacterFactory{
	//It will have one factory that takes a number and returns a Dungeon Character from it 
	public DungeonCharacter createCharacter(int characterID) {
		//This switch determines which hero gets created
		switch(characterID)
		{
			case 1: return new Warrior();

			case 2: return new Sorceress();

			case 3: return new Thief();

			default: System.out.println("invalid choice, returning Thief");
				     return new Thief();
		}//end switch
		
	}
}
