// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ScissorLift;
import edu.wpi.first.wpilibj2.command.Command;

public class ScissorLiftCommand extends Command {
  private final ScissorLift scissorLift;

  // TODO: add boolean flag for whether the scissor lift is going up or down
  public ScissorLiftCommand(ScissorLift containerScissorLift) {
    scissorLift = containerScissorLift;
    addRequirements(scissorLift);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    intake.dash();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intake.turnoff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
