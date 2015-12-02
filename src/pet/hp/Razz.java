package pet.hp;


/**
 * @see pet.hp.Game.Type#RAZZ
 */
public class Razz extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getStudstreetnames();
	}
}