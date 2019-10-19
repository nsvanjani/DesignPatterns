package com.design.patterns.visitor;

public class VisitorRunner {

	public static void main(String[] args) {
		Gun glock = new Glock();
		glock.shoot();
		GunAttachment laser = new LaserSight();
		glock.useGunAttachment(laser);
		glock.shoot();
		glock.shoot();
	}
}
