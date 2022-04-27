import java.util.function.Supplier;
import java.util.function.Consumer;

public class TurretToAngle implements Command {
  Robot robot;
  Turret turret;
  Consumer<Double> turnRobot;
  Supplier<Double> targetAngle;

  public TurretToAngle(Supplier<Double> targetAngle, Consumer<Double> turnRobot, Robot robot) {
    this.targetAngle = targetAngle;
    this.turnRobot = turnRobot;
    this.robot = robot;
  }

  @Override
  public void init() {
    turret = robot.getTurret();
  }

  @Override
  public void execute() {
    turnRobot.accept(targetAngle.get());
  }

  @Override
  public boolean isFinished() {
    return robot.getHeading() == targetAngle.get();
  }

  public void end(boolean interrupted) {
    
  }
}