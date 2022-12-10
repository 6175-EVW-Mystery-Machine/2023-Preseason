
package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;


import frc.robot.commands.ArcadeDrive;
//import frc.robot.commands.TankDrive;


public class DriveTrain extends SubsystemBase {
  
  /*
  private TalonSRX motorLeft1 = new TalonSRX(Constants.MOTOR_LEFT_1);
  private TalonSRX motorLeft2 = new TalonSRX(Constants.MOTOR_LEFT_2);
  private TalonSRX motorRight1 = new TalonSRX(Constants.MOTOR_RIGHT_1);
  private TalonSRX motorRight2 = new TalonSRX(Constants.MOTOR_RIGHT_2);
  */

  private static CANSparkMax motorLeft1 = new CANSparkMax(Constants.MOTOR_LEFT_1, MotorType.kBrushless);
  private CANSparkMax motorLeft2 = new CANSparkMax(Constants.MOTOR_LEFT_2, MotorType.kBrushless);
  private static CANSparkMax motorRight1 = new CANSparkMax(Constants.MOTOR_RIGHT_1, MotorType.kBrushless);
  private CANSparkMax motorRight2 = new CANSparkMax(Constants.MOTOR_RIGHT_2, MotorType.kBrushless);

  public static DifferentialDrive m_diffDrive = new DifferentialDrive(motorLeft1, motorRight1);
  
  
  public DriveTrain() {

    motorLeft1.setInverted(true);
    motorLeft2.follow(motorLeft1);
    motorRight2.follow(motorRight1);
    
  }

  @Override
  public void periodic() {

    setDefaultCommand(new ArcadeDrive());
  }

  public void setLeftMotors(double speed) {

    motorLeft1.set(-speed);
    motorLeft2.set(-speed);

  }

  public void setRightMotors(double speed) {

    motorRight1.set(speed);
    motorRight2.set(speed);

    }

  public void startArcadeDrive(double moveSpeed, double rotateSpeed) {

    m_diffDrive.arcadeDrive(moveSpeed, rotateSpeed);

  }
}


