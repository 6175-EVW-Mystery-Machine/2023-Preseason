
package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;

/*--------------------------------------------------------------------
*
*                     CREATE CONTROLLERS HERE
*
*-------------------------------------------------------------------*/
public class RobotContainer {

  private Joystick driveStick = new Joystick(Constants.DRIVE_STICK);

  public double GetDriverRawAxis(int axis) {
    return driveStick.getRawAxis(axis);
  }

  private XboxController driveXbox = new XboxController(Constants.DRIVE_XBOX);

  public double GetRawAxis(int axis) {
    return driveXbox.getRawAxis(axis);
  }
    
  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {}


  public Command getAutonomousCommand() {
    return null;
    
  }
}
