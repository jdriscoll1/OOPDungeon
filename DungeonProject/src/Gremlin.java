

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster{

    public Gremlin(){
    	
		name = "Gnarltooth the Gremlin";
		
		hitPoints = 70;
		attackSpeed = 5;
		
		chanceToHit = .8;
		chanceToHeal = .4;
		
		damageMin = 15; 
		damageMax = 30;
		
		minHeal = 20; 
		maxHeal = 40;

    }  // end constructor

	public void attack(DungeonCharacter opponent){
		
		System.out.println(name + " jabs his kris at " + opponent.getName() + ":");
		super.attack(opponent);

	}  // end override of attack

}  // end class Gremlin
