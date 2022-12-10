
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class TestAuto extends CommandBase {

  double m_time, m_lSpeed, m_rSpeed;

  public TestAuto(double time, double lSpeed, double rSpeed) {
    m_time = time;
    m_lSpeed = lSpeed;
    m_rSpeed = rSpeed;

    addRequirements(Robot.driveTrain);
  }

 /*
  @Override
  public void initialize() {
    Robot.driveTrain.setLeftMotors(m_lSpeed);
    Robot.driveTrain.setRightMotors(m_rSpeed);
    withTimeout(m_time);
  }
*/
 
  @Override
  public void execute() {}

 
  @Override
  public void end(boolean interrupted) {}

  /*
  @Override
  public boolean isFinished() {
    return TimedOut;
  }   */
}
