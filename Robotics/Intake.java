// public class Intake extends Subsystem {
//   DcMotor intakeOne;
//   DcMotor intakeTwo;

//   public Intake (HardwareMap hardwareMap, Gamepad gamepad) {
//     super(hardwareMap, gamepad);
//   }

//   @Override
//   public void init() {
//     intakeOne = hardwareMap.get(DcMotor.class, "intakeOne");
//     intakeTwo = hardwareMap.get(DcMotor.class, "intakeTwo");
//     intakeOne.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//     intakeTwo.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
//   }

//   @Override
//   public void update() {
//     if (gamepad.dpad_up || gamepad.dpad_down) {
//       intakeOne.setPower(gamepad.dpad_up ? 1 : -1);
//       intakeTwo.setPower(gamepad.dpad_up ? 1 : -1);
//     } else {
//       intakeOne.setPower(0);
//       intakeTwo.setPower(0);
//     }
//   }
// }