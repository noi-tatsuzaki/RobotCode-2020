package frc.robot.subClass;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ArmSensor {
    private TalonSRX armMotor;

    public ArmSensor(TalonSRX armMotor) {
        this.armMotor = armMotor;
    }


    public boolean getArmFrontSensor() {
        return armMotor.isFwdLimitSwitchClosed() == 1;
    }

    public boolean getArmBackSensor() {
        return armMotor.isRevLimitSwitchClosed() == 1;
    }
}
