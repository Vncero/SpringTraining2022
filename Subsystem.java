public abstract class Subsystem {
  public Gamepad gamepad;
  public HardwareMap hardwareMap;

  public Subsystem (HardwareMap hardwareMap, Gamepad gamepad) {
    this.gamepad = gamepad;
    this.hardwareMap = hardwareMap;
  }
  
  public abstract void init();
  public abstract void update();
}