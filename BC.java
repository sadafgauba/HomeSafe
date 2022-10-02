public class BC {
    
    public static void batteryControl() {
        Battery battery = new Battery();
        Notifications notif = new Notifications();
        while (true){
            if (battery.isCharged()) 
                notif.batteryFine();
            else 
                notif.batteryLow();
        }
    }
}
