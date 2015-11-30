package pet.hp;


/**
 * @see pet.hp.Game.Type#OMHL
 */
public class Omhl extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getHestreetnames();
	}
}