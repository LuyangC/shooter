package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.*;

public class Intake {
    public DcMotorEx intakeLeft, intakeRight;
    public double shooterSpeed = 1.0;

    public Intake(HardwareMap hardwareMap) {
        intakeLeft = hardwareMap.get(DcMotorEx.class, "intakeLeft");
        intakeRight = hardwareMap.get(DcMotorEx.class, "intakeRight");
    }

    public void spinLeftIntake() {
        intakeLeft.setPower(shooterSpeed);
    }

    public void spinRightIntake() {
        intakeRight.setPower(shooterSpeed);
    }

    public void spinLeftIntake(double speed) {
        intakeLeft.setPower(speed);
    }

    public void spinRightIntake(double speed) {
        intakeRight.setPower(speed);
    }
}
