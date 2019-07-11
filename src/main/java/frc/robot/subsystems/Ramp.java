/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Ramp extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  Spark leftRmp = new Spark(RobotMap.RAMP_L);
  Spark rightRmp = new Spark(RobotMap.RAMP_R);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void rampOn(){
    leftRmp.set(1);
    rightRmp.set(1);
  }

  public void rampOff(){
    leftRmp.set(0);
    rightRmp.set(0);
  }
}
