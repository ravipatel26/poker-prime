package pet.hp;


/**
 * @see pet.hp.Game.Type#BG
 */
public class Bg extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getTripdrawstreetnames();
	}
}