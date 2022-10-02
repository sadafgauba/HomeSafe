public class Storage {

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
    }



}
