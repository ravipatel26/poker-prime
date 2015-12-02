package pet.hp;


/**
 * @see pet.hp.Game.Type#OM
 */
public class Om extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getHestreetnames();
	}
}