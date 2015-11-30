package pet.hp;

import org.junit.Test;
import pet.eq.Poker;

public class GameUtilTest {

	@Test
	public void test() {
		
		// minimum number of hole cards for an equity calculation
		
		System.out.println("GameType\tMinHoleCards");
		System.out.println("--------\t------------");
		
		// Expected = 0
		Poker holdem = GameUtil.getPoker(Game.Type.HE);
		System.out.println("HoldEm:\t\t" + holdem.minHoleCards());
		
		// Expected = 2
		Poker omaha = GameUtil.getPoker(Game.Type.OM);
		System.out.println("Omaha:\t\t" + omaha.minHoleCards());
		
		// Expected = 2
		Poker fiveOmaha = GameUtil.getPoker(Game.Type.OM5);
		System.out.println("5-Omaha:\t" + fiveOmaha.minHoleCards());
		
		// Expected = 1
		Poker draw = GameUtil.getPoker(Game.Type.FCD);
		System.out.println("Draw:\t\t" + draw.minHoleCards());
		
		// Expected = 1
		Poker badugi = GameUtil.getPoker(Game.Type.BG);
		System.out.println("Badugi:\t\t" + badugi.minHoleCards());
		
		// Expected = 1
		Poker stud = GameUtil.getPoker(Game.Type.STUD);
		System.out.println("Stud:\t\t" + stud.minHoleCards());
		
	}

}
