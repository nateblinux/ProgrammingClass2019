/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Drive;


public class Drivetrain extends Subsystem {
  WPI_TalonSRX lDrive0 = new WPI_TalonSRX(RobotMap.L_DRIVE_0);
  WPI_TalonSRX lDrive1 = new WPI_TalonSRX(RobotMap.L_DRIVE_1);
  WPI_TalonSRX rDrive0 = new WPI_TalonSRX(RobotMap.R_DRIVE_0);
  WPI_TalonSRX rDrive1 = new WPI_TalonSRX(RobotMap.R_DRIVE_1);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new Drive());
  }

  public void setLSpeed(double speed){
    lDrive0.set(speed);
    lDrive1.set(speed);
  }
  public void setRSpeed(double speed){
    rDrive0.set(speed);
    rDrive1.set(speed);
  }

}
