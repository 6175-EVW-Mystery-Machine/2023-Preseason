
package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.subsystems.DriveTrain;


public class ArcadeDrive extends CommandBase {
  private static DriveTrain m_drivetrain;
  private DoubleSupplier m_speed;
  private DoubleSupplier m_turn;
  private XboxController m_Joystick;

  public ArcadeDrive(XboxController joystick,  DoubleSupplier speed, DoubleSupplier turn, DriveTrain drivetrain) {

    m_Joystick = joystick;
    m_speed = speed;
    m_turn = turn;
    m_drivetrain = drivetrain;

    addRequirements(m_drivetrain);

  }

  @Override
  public void initialize() {}
  
  @Override
  public void execute() {

    double moveSpeed = m_Joystick.getRawAxis(0);

    //double moveSpeed = m_speed.getAsDouble();
    double rotateSpeed = m_turn.getAsDouble();

  m_drivetrain.startArcadeDrive(moveSpeed, rotateSpeed);

  }
  
  @Override
  public void end(boolean interrupted) {

  m_drivetrain.startArcadeDrive(0,0);

  }

  @Override
  public boolean isFinished() {
    return false;
  }

}
