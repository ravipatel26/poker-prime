package pet.hp;


/**
 * @see pet.hp.Game.Type#STUDHL
 */
public class Studhl extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getStudstreetnames();
	}
}