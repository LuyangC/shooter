package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.*;

public class Chassis {
    public DcMotorEx frontLeft, frontRight, backLeft, backRight;
    public double frontPower, backPower;

    public Chassis (HardwareMap hardwareMap) {
        frontLeft = hardwareMap.get(DcMotorEx.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotorEx.class, "frontRight");
        backLeft = hardwareMap.get(DcMotorEx.class, "backLeft");
        backRight = hardwareMap.get(DcMotorEx.class, "backRight");

        frontLeft.setDirection(DcMotorEx.Direction.REVERSE);
        frontRight.setDirection(DcMotorEx.Direction.REVERSE);
    }

    public void setFrontPower(double power) {
        frontPower = power;
        frontLeft.setPower(frontPower);
        frontRight.setPower(frontPower);
    }

    public void setBackPower(double power) {
        backPower = power;
        backLeft.setPower(backPower);
        backRight.setPower(backPower);
    }

    public double getFrontPower() {
        return frontPower;
    }

    public double getBackPower() {
        return backPower;
    }
}
