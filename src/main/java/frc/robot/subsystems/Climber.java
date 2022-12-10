
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Climber extends SubsystemBase {

  private TalonSRX winchInner = new TalonSRX(Constants.WINCH_INNER_MOTOR);
  private TalonSRX winchOuter = new TalonSRX(Constants.WINCH_OUTER_MOTOR);

  private DoubleSolenoid solenoidInner = new DoubleSolenoid(Constants.INNER_MODULE_TYPE, Constants.INNER_FORWARD_CHANNEL, Constants.INNER_REVERSE_CHANNEL);
  private DoubleSolenoid solenoidOuter = new DoubleSolenoid(Constants.OUTER_MODULE_TYPE, Constants.OUTER_FORWARD_CHANNEL, Constants.OUTER_REVERSE_CHANNEL);


  public Climber() {}

  @Override
  public void periodic() {}

  public void setInnerWinch(int speed) {
    winchInner.set(ControlMode.PercentOutput, speed);
  }

  public void setOuterWinch(int speed) {
    winchOuter.set(ControlMode.PercentOutput, speed);
  }

  public void setInnerSolenoid(Value innerBoolean) {
    solenoidInner.set(innerBoolean);
  }

  public void setOuterSolenoid(Value outerBoolean) {
    solenoidOuter.set(outerBoolean);
  }

}