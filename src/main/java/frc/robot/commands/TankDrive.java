
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;


public class TankDrive extends CommandBase {

  public TankDrive() {

    addRequirements(Robot.driveTrain);

  }

  @Override
  public void initialize() {}

  
  @Override
  public void execute() {

    double leftStickY = Robot.m_robotContainer.GetRawAxis(Constants.XBOX_LEFT_Y);
    double rightStickY = Robot.m_robotContainer.GetRawAxis(Constants.XBOX_RIGHT_Y);

    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(rightStickY);

  }
  
  @Override
  public void end(boolean interrupted) {

    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);

  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
