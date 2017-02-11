package org.usfirst.frc.team4645.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4645.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick leftJoy = new Joystick(1);
	Button button1 = new JoystickButton(leftJoy, 1);
	Button button3 = new JoystickButton(leftJoy, 3);
	Button button4 = new JoystickButton(leftJoy, 4);
	Button button5 = new JoystickButton(leftJoy, 5);
	Button button6 = new JoystickButton(leftJoy, 6);
	Button button8 = new JoystickButton(leftJoy, 8);
	Button button9 = new JoystickButton(leftJoy, 9);
	
	public static double tempXMag;
	public static double tempYMag;
	public static double tempZMag;
	
	public static Button resetGyro = new JoystickButton(leftJoy, 7);
	
	public OI(){
	    
		button1.whileHeld(new ShootCommand());//will shootballs until button is released
		
		button4.whileHeld(new ReservoirCommand());
		
		tempXMag = -leftJoy.getX();
		tempYMag = leftJoy.getY();
		tempZMag = leftJoy.getZ();
		
		if (tempZMag < 0.2 && tempZMag > -0.2) {
			tempZMag = 0;
		}
		if (tempZMag < 0) {tempZMag += 0.2;}
		else if (tempZMag > 0) {tempZMag -= 0.2;}
		
		resetGyro.whenPressed(new ResetGyro());

	
	}
	// button.whenPressed(new ExampleCommand());

	
	// button.whileHeld(new ExampleCommand());

	
	// button.whenReleased(new ExampleCommand());
}
