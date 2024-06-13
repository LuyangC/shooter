package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.subsystems.*;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="Teleoperation")
public class Teleoperation extends OpMode {
    Shooter shooter;
    Chassis chassis;
    Intake intake;
    public void init() {
        //shooter = new Shooter(hardwareMap);
        //shooter.setPower(0.5);

        //chassis = new Chassis(hardwareMap);

        intake = new Intake(hardwareMap);

        telemetry.addLine("Init");
        telemetry.update();
    }

    public void loop() {
        //shooter.powerUp();
        //chassis.setBackPower(-0.2);
        //chassis.setFrontPower(-0.2);
        //intake.spinLeftIntake(-1);
        //intake.spinRightIntake(-1);
        intake.turnOnBelt();


        telemetry.addLine("Loop");
        telemetry.update();
    }

    public void stop() {

    }
}