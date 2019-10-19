package com.design.patterns.visitor;

public class Glock implements Gun{

	@Override
	public void shoot() {
		System.out.println("Bang!!");
	}

	@Override
	public void useGunAttachment(GunAttachment attachment) {
		attachment.activateAttachment();
	}

}
