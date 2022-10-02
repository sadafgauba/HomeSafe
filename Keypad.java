//  -2 => Enter
// -1 => Star (asterick)
public class Keypad {
    private int[] keyArr;

    public Keypad() {
        this.keyArr = keyArr;
    }

    // interrupt handler
    public void newKey() {

        // call this function when a key press is triggered
        // if the key entered is "enter" 
            // 
        //  if key pressed is "clear"
            // call pressedClear() 
        //  
        // if a timer is present and is NOT 60 seconds, kill that timer, else return
        // starts 10 second timer
        // receives the key value and the position
        // add the key in the keyArr at position received
        
    }

    // 
    public int[] getKey(int numPressed, int keyVal) {
        if (numPressed != -2 && numPressed != -1) {
            this.keyArr[numPressed - 1] = keyVal;
        }
        return this.keyArr;
    }

    public void checkKey(int numPressed, int keyVal) {
        // here get the key from file and then compare it with the keyArr pressed by the user
    }
    //  listening to key press

    
}
