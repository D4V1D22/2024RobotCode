// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.WinchConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Winch extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  // DECLARE MOTOR
  private CANSparkMax winchSparkMax;

  public Winch() {
    //Instantiate MOTOR
    winchSparkMax = new CANSparkMax(WinchConstants.winchMotorID, MotorType.kBrushless);
  }

  public void awaken()
  {
    winchSparkMax.set(WinchConstants.winchLiftPower);
  }

  public void slumber()
  {
    winchSparkMax.set(0.0);
  }


  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
