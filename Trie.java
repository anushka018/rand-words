/**Class that implements a Trie data structure, a 26-ary Tree for mapping English words*/

public class Trie <T> {
    private TrieNode<T> root;

    /**
     * Initializes a Trie object which intializes the root of the Trie to a new TrieNode
     */
    public Trie() {
        root = new TrieNode<>();
    }

    /**
     * Finds the TrieNode associated with a given word
     * @param input String the word whose appropriate TrieNode will be found
     * @return TrieNode<T> the associated node
     */
    private TrieNode<T> getNode(String input) {
        TrieNode<T> current = root;
        for (int i = 0; i < input.length() ; i++) {
            current = current.getChild(input.charAt(i));
        }
        return current;
    }

    /**
     * Gets the data currently stored on the TrieNode associated
     * with the input string
     * @param input String the word whose TrieNode data will be found
     * @return T the data stored in the corresponding TrieNode
     */
    public T get(String input) {
        return getNode(input).getData();
    }

    /**
     * Sets the data currently stored on the TrieNode associated with the input string to the T value provided
     * @param input String the word whose corresponding TrieNode data will be updates
     * @param val the new data that the TrieNode will be updates to store
     */
    public void put(String input, T val) {
        getNode(input).setData(val);
    }

    /**
     * Gets the root of the Trie
     * @return TrieNode<T> the root of the Trie
     */
    public TrieNode<T> getRoot() {
        return root;
    }
}
