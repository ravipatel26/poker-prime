package pet.hp;


/**
 * @see pet.hp.Game.Type#DSTD
 */
public class Dstd extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getTripdrawstreetnames();
	}
}