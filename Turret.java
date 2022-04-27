public class Turret extends Subsystem {
  public Servo yaw;
  private double scale;

  public Turret (HardwareMap hardwareMap, Gamepad gamepad, double scale) {
    super(hardwareMap, gamepad);
    this.scale = scale;
  }

  @Override
  public void init() {
    yaw = hardwareMap.get(Servo.class, "yaw");
  }

  @Override
  public void update() {
    double delta = gamepad.left_stick_x;
    if ((yaw.getPosition() > 0 && delta < 0) ||
          (yaw.getPosition() < 1 && delta > 0)) {
      yaw.setPosition(yaw.getPosition() + (delta / scale));
    }
  }

  public void setScale(double scale) {
    this.scale = scale;
  }

  public double getScale() {
    return scale;
  }
}