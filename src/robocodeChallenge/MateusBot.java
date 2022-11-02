package robocodeChallenge;

import robocode.*;

/**
 * MateusBot - A simplest bot maded by Mateus Pacheco.
 * <p>
 * The description of the bot will be here!
 * it will take a momen.
 * 
 * @author Mateus Pacheco (original)
 */

public class MateusBot extends Robot{
	public void run() {
		while(true) {
			ahead(100);
			turnRight(60);
			ahead(100);
			turnRight(60);
		}
	}
	
	public void onHitByBullet(HitByBulletEvent e) {
		turnRight(90 - e.getBearing());
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(1);
	}
}
