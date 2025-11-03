@FunctionalInterface
interface LightBehavior {
    void activate();
}

public class Home_Light_Automation {
    public void triggerLight(LightBehavior behavior) {
        behavior.activate();
    }

    public static void main(String[] args) {
        Home_Light_Automation system = new Home_Light_Automation();

        LightBehavior motionDetected = () -> System.out.println("Motion detected: Light ON for 2 minutes");
        LightBehavior nightTime = () -> System.out.println("Night time: Dim light ON");
        LightBehavior voiceCommand = () -> System.out.println("Voice command: Color cycle pattern activated");

        system.triggerLight(motionDetected);
        system.triggerLight(nightTime);
        system.triggerLight(voiceCommand);
    }
}
