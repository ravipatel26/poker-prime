package pet.hp;


/**
 * @see pet.hp.Game.Type#FSTUD
 */
public class Fstud extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getFcstudstreetnames();
		
		
	}
}