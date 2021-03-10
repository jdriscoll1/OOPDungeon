

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Skeleton extends Monster{

	public Skeleton(){
		
		name = "Sargath the Skeleton";
		
		hitPoints = 100;
		attackSpeed = 3;
		
		chanceToHit = .8;
		chanceToHeal = .3;
		
		damageMin = 30; 
		damageMax = 50;
		
		minHeal = 30; 
		maxHeal = 50;

    }  // end constructor

	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " slices his rusty blade at " + opponent.getName() + ":");
		super.attack(opponent);

	}  // end override of attack

}  // end class Skeleton
