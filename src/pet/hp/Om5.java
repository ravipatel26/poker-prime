package pet.hp;


/**
 * @see pet.hp.Game.Type#OM5
 */
public class Om5 extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getHestreetnames();
	}
}