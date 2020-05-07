package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message="Eres un robot, consulta con tu médico si los síntomas persisten")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
}
