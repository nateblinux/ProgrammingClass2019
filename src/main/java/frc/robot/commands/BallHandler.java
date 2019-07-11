/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class BallHandler extends Command {
  public BallHandler() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.basket);
    requires(Robot.ramp);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    switch(Robot.oi.opr.getPOV()){
      case(0):
        Robot.basket.eject();
        break;
      case(180):
        Robot.basket.intake();
        Robot.ramp.rampOn();
        break;
      default:
        Robot.basket.off();
        Robot.ramp.rampOff();
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
