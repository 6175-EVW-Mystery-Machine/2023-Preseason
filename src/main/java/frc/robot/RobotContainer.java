
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.DriveTrain;

/*--------------------------------------------------------------------
*
*                     CREATE CONTROLLERS HERE
*
*-------------------------------------------------------------------*/
public class RobotContainer {

   private static DriveTrain driveTrain = new DriveTrain();



  private XboxController driveXbox = new XboxController(Constants.DRIVE_XBOX);

  public double GetRawAxis(int axis) {
    return driveXbox.getRawAxis(axis);
  }
    
  public RobotContainer() {
    driveTrain.setDefaultCommand(new ArcadeDrive(driveXbox,
                                                  ()->driveXbox.getRawAxis(Constants.RIGHT_STICK_Y),
                                                  ()->driveXbox.getRawAxis(Constants.RIGHT_STICK_X),
                                                  driveTrain));
    configureButtonBindings();
  }

  private void configureButtonBindings() {}


  public Command getAutonomousCommand() {
    return null;
    
  }
}
