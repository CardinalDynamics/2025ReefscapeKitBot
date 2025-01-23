package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
public class Roller {
    TalonSRX m_roller;
    public Roller(){
        // constructing motor controller object, 
        m_roller = new TalonSRX(0);
        // invert motor so that when it receives positive input it will roll out coral
        m_roller.setInverted(true);


    }
    public void runRoller(){
        m_roller.set(1.0);

    }
    public void stopRoller(){
        m_roller.set(0);
    }
}
