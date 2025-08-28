package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="basics", group="Linear OpMode")
public class basics extends LinearOpMode {
    private DcMotor eater = null;
    private Servo flippy = null;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addLine("shooter pooper jeffy shooter");
        telemetry.update();
        eater=hardwareMap.get(DcMotor.class,"Eater");
        eater.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        flippy=hardwareMap.get(Servo.class, "Flippy");

        waitForStart();
        while(opModeIsActive()){
            if(gamepad1.cross){
                eater.setPower(1);
            } else if (gamepad1.triangle) {
                eater.setPower(-1);
            } else {
                eater.setPower(0);
            }

            if(gamepad1.right_trigger>0.15){
                flippy.setPosition(0.1698);
            } else {
                flippy.setPosition(0.9144);
            }

        }




    }
}
