package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.*;

public class Intake {
    public DcMotorEx intakeLeft, intakeRight;
    public CRServo belt;
    public Servo indexer;
    public double shooterSpeed = .60;

    public Intake(HardwareMap hardwareMap) {
        intakeLeft = hardwareMap.get(DcMotorEx.class, "intakeLeft");
        intakeRight = hardwareMap.get(DcMotorEx.class, "intakeRight");
        belt = hardwareMap.get(CRServo.class, "belt");
        indexer = hardwareMap.get(Servo.class, "indexer");
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

    public void turnOnBelt() {
        belt.setPower(-1.0);
    }

    public void turnOffBelt() {
        belt.setPower(0.0);
    }

    public void intakeIndexer() {
        indexer.setPosition(0.49);
    }

    public void outtakeIndexer() {
        indexer.setPosition(1);
    }
}
