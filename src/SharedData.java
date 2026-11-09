import java.util.ArrayList;

/**
 * Class to hold shared data with an ArrayList and other variables.
 */
public class SharedData {
    private ArrayList<Integer> array;
    private boolean[] winArray;
    private boolean flag;
    private final int b;

    /**
     * Constructor for SharedData class.
     *
     * @param array the initial ArrayList of Integers
     * @param b       the constant integer value
     */
    public SharedData(ArrayList<Integer> array, int b) {
        this.array = array;
        this.b = b;
        // Initialize winArray with the size of the new ArrayList
        this.winArray = new boolean[array.size()];
    }

    /**
     * Getter method for winArray.
     *
     * @return the winArray
     */
    public boolean[] getWinArray() {
        return winArray;
    }

    /**
     * Setter method for winArray.
     *
     * @param winArray the new winArray to set
     */
    public void setWinArray(boolean[] winArray) {
        this.winArray = winArray;
    }

    /**
     * Getter method for array.
     *
     * @return the array
     */
    public ArrayList<Integer> getArray() {
        return array;
    }

    /**
     * Getter method for b.
     *
     * @return the value of b
     */
    public int getB() {
        return b;
    }

    /**
     * Getter method for flag.
     *
     * @return the value of flag
     */
    public boolean getFlag() {
        return flag;
    }

    /**
     * Setter method for flag.
     *
     * @param flag the new value of flag to set
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
