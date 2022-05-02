// import java.util.ArrayList;

// public class Climber extends Subsystem {
//   DcMotor climberOne;
//   DcMotor climberTwo;
//   ArrayList<DcMotor> climbers = {climberOne, climberTwo};
//   DcMotor higherClimber = climberOne.getCurrentPosition() == climberTwo.getCurrentPosition() ? null : climberOne.getCurrentPosition() > climberTwo.getCurrentPosition() ? climberOne : climberTwo;

//   public Climber (HardwareMap hardwareMap, Gamepad gamepad) {
//     super(hardwareMap, gamepad);
//   }

//   @Override
//   public void init() {
//     climberOne = hardwareMap.get(DcMotor.class, "climberOne");
//     climberTwo = hardwareMap.get(DcMotor.class, "climberTwo");

//     climberOne.setMode();
//     climberTwo.setMode();
//   }

//   @Override
//   public void update() {
//    if (gamepad.y) {
//      try {
//        higherClimber.setTargetPosition();
//     } catch (NullPointerException n) {
       
//     }
//      higherClimber.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//      //not sure how waiting for the climber to correct could work
//    }
    
//    if (gamepad.left_bumper) {
//      climberOne.setPower(gamepad.x ? -1 : 1);
//    } else if (gamepad.right_bumper) {
//      climberTwo.setPower(gamepad.x ? -1 : 1);
//    } else {
//      stop();
//    }
//   }

//   public void stop() {
//     climberOne.setPower(0);
//     climberTwo.setPower(0);
//   }
  
// }