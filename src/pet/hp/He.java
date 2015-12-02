package pet.hp;


/**
 * @see pet.hp.Game.Type#HE
 */
public class He extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getHestreetnames();
	}
}