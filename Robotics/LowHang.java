// import java.util.function.Consumer;
// import java.util.function.Supplier;

// public class LowHang implements Command {
//   Robot robot;
//   Climber climber;
//   Consumer<Double> raiseClimber;
//   Supplier<Double> targetPosition;

//   public LowHang(Supplier<Double> targetPosition, Consumer<Double> raiseClimber, Robot robot) {
//     this.targetPosition = targetPosition;
//     this.raiseClimber = raiseClimber;
//     this.robot = robot;
//   }

//   @Override
//   public void init() {
//     climber = robot.getClimber();
//   }

//   @Override
//   public void execute() {
//     raiseClimber.accept(targetPosition.get());
//   }

//   @Override
//   public boolean isFinished() {
//     return climber.getPosition() == targetPosition.get();
//   }

//   public void end(boolean interrupted) {
//     climber.stop();
//   }
// }