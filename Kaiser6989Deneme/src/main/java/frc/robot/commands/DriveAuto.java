// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class DriveAuto extends CommandBase {
  /** Creates a new DriveAuto. */
  DriveTrain driveTrain;
  public DriveAuto(DriveTrain drive) {
    // Use addRequirements() here to declare subsystem dependencies.
    driveTrain = drive;
    addRequirements(driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveTrain.arcadeDrive(0, 0.4, false);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Timer.delay(1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.arcadeDrive(0, 0, false);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}