package org.usfirst.frc.team2960.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class MoveForwardWithAlignAndPlaceGear extends CommandGroup {
	public MoveForwardWithAlignAndPlaceGear(){
		addSequential(new Delay(500));
		addSequential(new MoveForwardUltraOrHitButton(5, .8));
		addSequential(new MoveForwardUltra(20, 1));
		
	}
}



