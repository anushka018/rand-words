//Name: Anushka Angamuthu, x500:angam003
/**Class that implements a Letter Sample object which tracks segments of a word and their subsequents
 * characters */

public class LetterSample {
    private String segment;
    private char nextLetter;
    public static final char STOP = '.';

    /**
     * Initializes a letter sample object
     * @param segment String the "chunks" the word is split into
     * @param nextLetter char the letter following the segment in the word
     */
    public LetterSample(String segment, char nextLetter) {
        this.segment = segment;
        this.nextLetter = nextLetter;
    }

    /**
     * Gets the current segment
     * @return String the "chunk" of the letter
     */
    public String getSegment() {
        return segment;
    }

    /**
     * Gets the next letter
     * @return char the letter following the current segment in the word
     */
    public char getNextLetter() {
        return nextLetter;
    }

    /**
     * Prints a LetterSample object
     * @return String with quotes containing the segment, an arrow, and the next letter
     */
    public String toString() {
        return "\"" + segment +"\"" + " -> " + nextLetter;
    }

    /**
     *Generates LetterSample objects from a given word
     * @param input String the word the samples will be generated from
     * @param segmentSize int the length of the segments that the word will be split into
     * @return LetterSample array containing each of the letter sample objects
     */
    public static LetterSample [] toSamples (String input , int segmentSize ) {
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        input += STOP;
        LetterSample [] segments = new LetterSample[input.length()];
        String seg = "";
        char next = input.charAt(0);
        segments[0] = new LetterSample(seg,next);
        int startIdx = 0;
        int endIdx = 1;
        int count = 1;
        while(next!= STOP){
            if (seg.length() != segmentSize){
                seg = input.substring(startIdx, endIdx);
                next = input.charAt(endIdx);
                endIdx++;
                segments[count] = new LetterSample(seg,next);
            }
            else {
                startIdx ++;
                seg = input.substring(startIdx, endIdx);
                next = input.charAt(endIdx);
                segments[count] = new LetterSample(seg,next);
                endIdx++;
            }
            count ++;
        }
        return segments;
    }
}
