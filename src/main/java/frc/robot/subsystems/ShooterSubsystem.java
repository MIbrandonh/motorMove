// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class ShooterSubsystem extends SubsystemBase {
  private final WPI_TalonFX m_shooterMotor = new WPI_TalonFX(5);

  /** Creates a new ExampleSubsystem. */
  public ShooterSubsystem() {
  }

  @Override
  public void periodic() {
    m_shooterMotor.set(0.1);
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
