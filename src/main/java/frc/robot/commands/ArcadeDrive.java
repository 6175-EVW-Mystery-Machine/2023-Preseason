
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;


public class ArcadeDrive extends CommandBase {

  public ArcadeDrive() {

    addRequirements(Robot.driveTrain);

  }

  @Override
  public void initialize() {}
  
  @Override
  public void execute() {

    double moveSpeed = Robot.m_robotContainer.GetDriverRawAxis(Constants.RIGHT_STICK_Y);
    double rotateSpeed = Robot.m_robotContainer.GetDriverRawAxis(Constants.RIGHT_STICK_X);

  DriveTrain.m_diffDrive.arcadeDrive(moveSpeed, rotateSpeed);

  }
  
  @Override
  public void end(boolean interrupted) {

  Robot.driveTrain.startArcadeDrive(0,0);

  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
