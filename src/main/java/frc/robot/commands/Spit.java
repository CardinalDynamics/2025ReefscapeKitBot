package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Roller;
public class Spit extends Command{
    Roller m_roller;
    public Spit(Roller roller){
        m_roller = roller;
        addRequirements(m_roller);
    }
    public void initialize() {
        m_roller.runRoller();
    }

    public boolean isFinished() {
        return false;
    }

    public void end() {
        m_roller.stopRoller();
    }
}
