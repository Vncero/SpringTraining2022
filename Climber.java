public class Climber extends Subsystem {
  DcMotor climberOne;
  DcMotor climberTwo;
  DcMotor temporaryClimber;

  public Climber (HardwareMap hardwareMap, Gamepad gamepad) {
    super(hardwareMap, gamepad);
  }

  @Override
  public void init() {
    climberOne = hardwareMap.get(DcMotor.class, "climberOne");
    climberTwo = hardwareMap.get(DcMotor.class, "climberTwo");
  }

  @Override
  public void update() {
   if (gamepad.y) {
     boolean leftIsHigher = climberOne.getCurrentPosition() > climberTwo.getCurrentPosition();
     temporaryClimber = (leftIsHigher ? climberOne : climberTwo);
     temporaryClimber.setTargetPosition(leftIsHigher ? climberTwo.getCurrentPosition() : climberOne.getCurrentPosition());
     temporaryClimber.setMode(DcMotor.RunMode.RUN_TO_POSITION);
     //not sure how waiting for the climber to correct could work
   }
    
   if (gamepad.left_bumper) {
     climberOne.setPower(gamepad.x ? -1 : 1);
   } else if (gamepad.right_bumper) {
     climberTwo.setPower(gamepad.x ? -1 : 1);
   } else {
     climberOne.setPower(0);
     climberTwo.setPower(0);
   }
  }
}