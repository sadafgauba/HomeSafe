public class Notifications {

    // TODO: which function(s) below have an alarm?

    public void safeLocked() {
        //  show this on the display
        System.out.println("DOOR-CLOSING");
    }

    public void safeUnlocked() {
        //  show this on the display
        System.out.println("DOOR-OPENING");
    }

    public void batteryLow() {
        //  show this on the display
        System.out.println("LOW-BATTERY");
    }

    public void batteryFine() {
        //  show this on the display
        System.out.println("CHARGED-BATTERY");
    }
    public boolean alarm() {
        // TODO: Add different types of alarms 
        System.out.println("ALARM ALARM");
        return true;
    }
}
