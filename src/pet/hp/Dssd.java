package pet.hp;


/**
 * @see pet.hp.Game.Type#DSSD
 */
public class Dssd extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getDrawstreetnames();
	}
}