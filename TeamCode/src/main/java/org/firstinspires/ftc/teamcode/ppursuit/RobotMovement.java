package org.firstinspires.ftc.teamcode.ppursuit;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotMovement {
    double turnP;
    double turnI;
    double turnD;

    double driveP;
    double driveI;
    double driveD;

    // public double lookAhead = 3; // inches
    public static void goToPosition(double newX, double newY, double speed) {
        double newHeading = Math.tan(newY / newX);
        double distance = Math.hypot(newY,  newX);


    }

    public static void turnWithPID() {

    }
}
