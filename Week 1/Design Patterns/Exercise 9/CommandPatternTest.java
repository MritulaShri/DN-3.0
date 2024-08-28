public class CommandPatternTest {
    public static void main(String[] args) {
        // Create a Light object (Receiver)
        Light livingRoomLight = new Light();

        // Create command objects
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create an Invoker (RemoteControl)
        RemoteControl remote = new RemoteControl();

        // Turn the light on
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}
