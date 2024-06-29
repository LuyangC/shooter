package org.firstinspires.ftc.teamcode.ppursuit;

public class MathFunctions {
    public static double AngleWrap(double angle) {
        while (angle < -Math.PI) {
            angle += 2 * Math.PI;
        }
        while (angle > Math.PI) {
            angle -= 2 * Math.PI;
        }
        return angle;
    }

    public static double inchesToTicks(double inches) {
        return ((inches * 25.4) / 96 ) * 384.5;
    }
}
