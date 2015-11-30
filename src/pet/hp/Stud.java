package pet.hp;


/**
 * @see pet.hp.Game.Type#STUD
 */
public class Stud extends Gametype {
	public String[] getStreetNames(Game.Type gametype) {
		return GameUtil.getStudstreetnames();
	}
}