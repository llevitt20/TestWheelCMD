
package org.usfirst.frc.team2521.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANTalon;
import org.usfirst.frc.team2521.robot.commands.setWheel;
import org.usfirst.frc.team2521.robot.OI;
import org.usfirst.frc.team2521.robot.RobotMap;

/**
 *
 */
public class Drive extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon wheel;
	public Drive()
	{
		wheel = new CANTalon(RobotMap.CAN_TALON_ADRESS);
	}
    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new setWheel());
    }
    public void setWheel()
    {
    	wheel.set(OI.getInstance().getStick().getY());
    }
}

