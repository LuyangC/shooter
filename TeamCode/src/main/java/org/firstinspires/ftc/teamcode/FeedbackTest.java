package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.subsystems.*;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;


@TeleOp(name="FeedbackTest")
public class FeedbackTest extends OpMode {
    IMU imu;
    DcMotorEx leftDT, rightDT;
    RevHubOrientationOnRobot.LogoFacingDirection logoDirection = RevHubOrientationOnRobot.LogoFacingDirection.UP;
    RevHubOrientationOnRobot.UsbFacingDirection  usbDirection  = RevHubOrientationOnRobot.UsbFacingDirection.RIGHT;
    RevHubOrientationOnRobot orientationOnRobot = new RevHubOrientationOnRobot(logoDirection, usbDirection);

    public void init() {
        imu = hardwareMap.get(IMU.class, "imu");
        imu.initialize(new IMU.Parameters(orientationOnRobot));

        leftDT = hardwareMap.get(DcMotorEx.class, "frontRight");
        rightDT = hardwareMap.get(DcMotorEx.class, "backLeft");

        leftDT.setDirection(DcMotorEx.Direction.REVERSE);

        leftDT.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        leftDT.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        leftDT.setTargetPosition(0);
        leftDT.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);

        rightDT.setMode(DcMotorEx.RunMode.RUN_USING_ENCODER);
        rightDT.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        rightDT.setTargetPosition(0);
        rightDT.setMode(DcMotorEx.RunMode.RUN_TO_POSITION);
    }

    public void loop() {
        YawPitchRollAngles orientation = imu.getRobotYawPitchRollAngles();
        telemetry.addLine("Yaw: " + orientation.getYaw(AngleUnit.DEGREES));
        telemetry.addLine("Roll: " + orientation.getRoll(AngleUnit.DEGREES));
        telemetry.addLine("Pitch: " + orientation.getPitch(AngleUnit.DEGREES));

        telemetry.addLine("Left Side DT Position: " + leftDT.getCurrentPosition());
        telemetry.addLine("Right Side DT Position: " + rightDT.getCurrentPosition());
        telemetry.update();
    }

    public void stop() {

    }
}