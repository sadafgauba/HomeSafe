
/*
    private int[] keyStored;


    private int[] getKeyFromStorage() {
        // read passcode from csv file, turn into  and return
    }
    public int[] readPasscode() {
        // TODO: here read the passcode from csv file to the keyStored variable and return the variable
        return keyStored;
    }

    public void writeNewPasscode(int[] newPasscode) {
        for (int i=0; i < 4; i++) {
            keyStored[i] = newPasscode[i];
        }
        // TODO: here write the new passcode to csv
    }*/



import java.util.*;


    public class Storage {

        public int counter = 0;
        private int[] newPasscode={2,3,4,5};
        public int[] PIN={1,2,5,4};
        public static boolean PINcheck;
        public boolean resetbutton=false;
        public int[] storedPSC={1,2,3,4};

        public boolean readPasscode(int[] PIN, int[] storedPSC){
            Door door = new Door();
            for (int i = 0; i < 4; i++) {
                if (storedPSC[i] == PIN[i]) {
                    i++;
                }
                else {
                    PINcheck = false;
                    System.out.println(PINcheck);
                    door.door_control(PINcheck);
                    return PINcheck;
                }
            }
            PINcheck = true;
            System.out.println(PINcheck);
            door.door_control(PINcheck);

            return PINcheck;
        }

        public void resetPasscode(boolean resetbutton){
            if (resetbutton) {
                writePasscode(newPasscode,storedPSC);
                System.out.println("Password changed");
                System.out.println(Arrays.toString(storedPSC));
            }
            else {
                System.out.println("reset button not pressed");
                return;
            }
        }
        public void writePasscode(int[] newPasscode,int[] storedPSC){
            for (int i = 0; i < 4; i++) {
                storedPSC[i] = newPasscode[i];
            }
            return;
        }





    public static void main(String args[]) {
        Storage ps = new Storage();
        ps.readPasscode(ps.PIN, ps.storedPSC);
        ps.resetPasscode(ps.resetbutton);


    }
    }


