package pet.hp;


/**
 * @see pet.hp.Game.Type#AFTD
 */
public class Aftd extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getTripdrawstreetnames();
	}
}