/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.RollerOff;
import frc.robot.commands.RollerOn;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick drv1 = new Joystick(0);
  public Joystick drv2 = new Joystick(1);
  public Joystick opr = new Joystick(2);

  Button rollerBtn = new JoystickButton(opr, 5);

  public OI(){
    rollerBtn.whenPressed(new RollerOn());
    rollerBtn.whenReleased(new RollerOff());
  }
}
