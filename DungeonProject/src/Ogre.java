
/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Ogre extends Monster{

	public Ogre(){

		name = "Oscar the Ogre";
		
		hitPoints = 200;
		attackSpeed = 2;
		
		chanceToHit = .6;
		chanceToHeal = .1;
		
		damageMin = 30; 
		damageMax = 50;
		
		minHeal = 30; 
		maxHeal = 50;

	}   // end constructor


//-----------------------------------------------------------------
	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " slowly swings a club toward's " + opponent.getName() + ":");
		super.attack(opponent);

	}   // end override of attack

}   // end Monster class
