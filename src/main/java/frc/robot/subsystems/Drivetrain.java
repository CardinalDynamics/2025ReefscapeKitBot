package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.drive.*;
public class Drivetrain extends SubsystemBase{
    DifferentialDrive driveTrain;
    WPI_TalonSRX leftFront;
    WPI_TalonSRX rightFront;
    WPI_TalonSRX leftBack;
    WPI_TalonSRX rightBack;
    public Drivetrain(){
        // initializing all drivetrain motors
        leftFront = new WPI_TalonSRX(1);
        rightFront = new WPI_TalonSRX(2);
        leftBack = new WPI_TalonSRX(3);
        rightBack = new WPI_TalonSRX(4);
        
        // set volt limit on all the motor controllers to rex's volt limit
        TalonSRXConfiguration config = new TalonSRXConfiguration();
        config.peakCurrentLimit = 60;
        leftFront.configAllSettings(config);
        rightFront.configAllSettings(config);
        leftBack.configAllSettings(config);
        rightBack.configAllSettings(config);

        //setting back motors to follow the front
        leftBack.follow(leftFront);
        rightBack.follow(rightFront);

        // inverting the motors on the left side so both sides go forward
        leftFront.setInverted(true);
        rightFront.setInverted(false);

        //put the front motors into the DifferentialDrive object to control all 4 drivemotors
        driveTrain = new DifferentialDrive(leftFront, rightFront);
    }
}
