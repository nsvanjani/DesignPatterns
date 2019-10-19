package com.design.patterns.visitor;

public class LaserSight implements GunAttachment {

	@Override
	public void activateAttachment() {
		System.out.println("aiming from Laser sight");
	}

}
