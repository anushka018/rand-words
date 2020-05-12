//Name: Anushka Angamuthu, x500:angam003
/**Class that implements a CharBag data structure which stores multiple, unordered lowercase alphabetic
 * characters*/
import java.util.Random;

public class CharBag {

    private int [] charBag = new int [27];
    private int size;

    /**
     * Initializes a new CharBag object with 0 elements
     */
    public CharBag() {
        this.size = 0;
    }

    /**
     * Adds an element to the CharBag
     * @param c char the element to be added. Adds the STOP character if not alphabetic
     */
    public void add(char c) {
        if (!Character.isAlphabetic(c)){
            c = '.';
            charBag[26]++;
        }
        else {
            c = Character.toLowerCase(c);
            int idx = (int) c - 97;
            charBag[idx]++;
        }
        size++;
    }

    /**
     * Removes an element to the CharBag
     * @param c char the element to be removed. Removes the STOP character if not alphabetic
     */
    public void remove(char c) {
        if (!Character.isAlphabetic(c)){
            if (charBag[26] > 0) {
                charBag[26]--;
                size--;
            }
        }
        else {
            c = Character.toLowerCase(c);
            int idx = (int) c - 97;
            if (charBag[idx] > 0) {
                charBag[idx]--;
                size--;
            }
        }
    }

    /**
     * Returns the numbers of elements contained in the CharBAg for a given character
     * @param c char the element whose amount will be determined
     * @return int the number of occurrences of the given element in the CharBag
     */
    public int getCount(char c) {
        int idx = (int) c - 97;
        if (!Character.isAlphabetic(c)) {
            return charBag[26];
        }
        else {
            return charBag[idx];
        }
    }

    /**
     * Find the size of a CharBag
     * @return int the number of elements in the CharBag
     */
    public int getSize(){
        return size;
    }

    /**
     * Prints a CharBag object
     * @return String with each character, a colon, and its count
     */
    public String toString() {
        String chars = "CharBag{";
        for (int i = 0; i < 26 ; i++) {
            chars += (char)(i + 97);
            chars += ":" + charBag[i] + ", ";
        }
        chars += '.' + ":" + charBag[26] + "}";
        return chars;
    }

    /**
     * Gets a random character from the CharBag
     * @return char a random char or the STOP character if the CharBag is empty
     */
    public char getRandomChar() {
        if (getSize() == 0){
            return '.';
        }
        Random r = new Random();
        int count = r.nextInt(getSize());
        for (int i = 0; i < 26; i++) {
            count -= charBag[i];
            if (count < 0){
                return (char)(i + 97);
            }
        }
        return '.';
    }









}
