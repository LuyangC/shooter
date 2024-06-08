package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.*;

public class Shooter {
    public DcMotorEx shooter1, shooter2;
    public double power = 0;
    public Shooter (HardwareMap hardwareMap) {
        shooter1 = hardwareMap.get(DcMotorEx.class, "shooter1");
        shooter2 = hardwareMap.get(DcMotorEx.class, "shooter2");
    }

    public void powerUp() {
        power = 1;
        shooter1.setPower(power);
        shooter2.setPower(power);
    }

    public void turnOff() {
        power = 0;
        shooter1.setPower(power);
        shooter2.setPower(power);
    }

    public double returnPower() {
        return power;
    }

    public void setPower(double newPower) {
        power = newPower;
    }
}
