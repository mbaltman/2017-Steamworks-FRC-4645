package org.usfirst.frc.team4645.robot.subsystems;

import org.usfirst.frc.team4645.robot.Robot;
import org.usfirst.frc.team4645.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;


/**
 *
 */
public class Reservoir extends Subsystem {

	public static final Servo servo1 =  new Servo(RobotMap.reservoirServo);

    public void initDefaultCommand() {
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void spinIn()
    {
    	servo1.set(1);
    }
    
    public void spinOut()
    {
    	servo1.set(.5);
    }
    
    public void alternate() 
    {
    	if(servo1.get()<.51)
    	{
    		spinIn();
    	}
    		
    	if(servo1.get()>.99)
    	{
    		spinOut();
    	}
    }
  
   
}

