import java.util.Scanner;  // Import the Scanner class
public class Door {
    public boolean sensor_status = false;
    /* 
     * The DOOR object has access and control over the physical devices of the Solenoid Motor and the Sensor Door. 
     * All interaction with these devices must go through the DOOR.
     */


    public void door_control(boolean order_to_door) { //This function opens or closes the door depending of the comparison of the local and stored passcode

        if (order_to_door && sensor_status){

            unlock();
            openedDoor();



        } else if (!order_to_door && !sensor_status) {

            lock();
            lockedDoor();

        }
        else if (order_to_door && !sensor_status) {
            //lock();
            //lockedDoor();
            System.out.println("DOOR already opened");

        }

        else if (!order_to_door && sensor_status) {

            System.out.println("DOOR already closed");


        }
    }








    void lock() { //This function makes the door lock up by deactivating the solenoid.
        System.out.println("activate solenoid");
        System.out.println("CLOSING the door");
        sensor_status = true;
    }

    void unlock() {

        System.out.println("activate solenoid");
        System.out.println("OPEN the door");
        sensor_status = false;


    }

    void openedDoor() {
        System.out.println("send notification UNLOCK");


    }

    void lockedDoor() {

        System.out.println("send notification LOCK");
    }




    public static void main(String[] args) {
       /* Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("order_to_door");

        //String order_to_door = myObj.nextLine();  // Read user input
        boolean order_to_door = Storage.PINcheck;
        boolean door_status = Storage.a2;
        System.out.println("order_to_door " + order_to_door);  // Output user input

        System.out.println("door_status");

        //String door_status = myObj.nextLine();  // Read user input
        System.out.println("door_status " + door_status);  // Output user input
        System.out.println(order_to_door);
        System.out.println(door_status);
        //boolean a1=Boolean.parseBoolean(order_to_door);
        //boolean a2=Boolean.parseBoolean(door_status);*/
        //door_control(order_to_door,door_status);

    }

     
}


