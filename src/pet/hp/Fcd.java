package pet.hp;


/**
 * @see pet.hp.Game.Type#FCD
 */
public class Fcd extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getDrawstreetnames();
	}
}