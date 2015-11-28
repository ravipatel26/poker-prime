package pet.eq;

import pet.eq.impl.DrawPoker;
import pet.eq.impl.FiveStudPoker;
import pet.eq.impl.HEPoker;
import pet.eq.impl.StudPoker;
import pet.hp.Game;

public class PokerFactory {

	private static PokerFactory instance = null;

	protected PokerFactory() {}

	public static PokerFactory getInstance() {

		if (instance == null)
			return new PokerFactory();

		return instance;
	}

	public Poker getPoker(Game.Type gameType) {

		switch (gameType) {
			case FCD:
				return new DrawPoker(Value.hiValue);
			case HE:
				return new HEPoker(false, false);
			case OM:
			case OM5:
			case OM51:
				return new HEPoker(true, false);
			case OMHL:
			case OM5HL:
			case OM51HL:
				return new HEPoker(true, true);
			case DSTD:
			case DSSD:
				return new DrawPoker(Value.dsLowValue);
			case AFTD:
				return new DrawPoker(Value.afLowValue);
			case STUD:
				return new StudPoker(Value.hiValue, false);
			case RAZZ:
				return new StudPoker(Value.afLowValue, false);
			case STUDHL:
				return new StudPoker(Value.hiValue, true);
			case BG:
				return new DrawPoker(Value.badugiValue);
			case FSTUD:
				return new FiveStudPoker();
			default:
				throw new RuntimeException("no poker for game " + gameType);
		}
	}

}

