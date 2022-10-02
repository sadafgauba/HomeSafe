import java.util.Scanner;  // Import the Scanner class
public class Door {
    /* 
     * The DOOR object has access and control over the physical devices of the Solenoid Motor and the Sensor Door. 
     * All interaction with these devices must go through the DOOR.
     */


    static void door_control(boolean order_to_door ,boolean door_status) { //This function opens or closes the door depending of the comparison of the local and stored passcode

        if (order_to_door && door_status){

            unlock();
            openedDoor();



        } else if (!order_to_door && !door_status) {

            lock();
            lockedDoor();

        }
        else if (order_to_door && !door_status) {
            //lock();
            //lockedDoor();
            System.out.println("DOOR already opened");

        }

        else if (!order_to_door && door_status) {

            System.out.println("DOOR already closed");


        }
    }








    static void lock() { //This function makes the door lock up by deactivating the solenoid.
        System.out.println("activate solenoid");
        System.out.println("CLOSING the door");
    }

    static void unlock() {

        System.out.println("activate solenoid");
        System.out.println("OPEN the door");


    }

    static void openedDoor() {
        System.out.println("send notification UNLOCK");


    }

    static void lockedDoor() {
        System.out.println("send notification LOCK");
    }




    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("order_to_door");

        String order_to_door = myObj.nextLine();  // Read user input
        System.out.println("order_to_door " + order_to_door);  // Output user input

        System.out.println("door_status");

        String door_status = myObj.nextLine();  // Read user input
        System.out.println("door_status " + door_status);  // Output user input
        System.out.println(order_to_door);
        System.out.println(door_status);
        boolean a1=Boolean.parseBoolean(order_to_door);
        boolean a2=Boolean.parseBoolean(door_status);
        door_control(a1,a2);

    }

     
}


