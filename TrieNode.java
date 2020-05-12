//Name: Anushka Angamuthu, x500:angam003
/**Class that implements a single node of a trie data structure which maps English words*/
public class TrieNode <T> {
    private T data;
    private TrieNode<T> [] children;

    /**
     * Initializes a TrieNode object with null data and an array of 26 TrieNode children
     */
    public TrieNode() {
        data = null;
        children = new TrieNode[26];
    }

    /**
     * Gets the data stored in a TrieNode object
     * @return T the data
     */
    public T getData () {
        return data;
    }

    /**
     * modifies the data stored in a TrieNode object
     * @param val T the new value to change the data to
     */
    public void setData(T val) {
        data = val;
    }

    /**
     * Find the TrieNode array associated with a given letter
     * @param letter char the letter whose TrieNode array will be found
     * @return TrieNode<T> Letter's associated TrieNode array
     */
    public TrieNode<T> getChild(char letter) {
        if (!Character.isAlphabetic(letter) || !Character.isLowerCase(letter)){
            return null;
        }
        else {
            int idx = (int) letter - 97;
            if (children[idx] == null) {
                TrieNode<Character> tn = new TrieNode<>();
                children[idx] = (TrieNode) tn;
                return children[idx];
            }
            else {
                return children[idx];
            }
        }
    }

    /**
     * computes the number of nodes in a Trie the are visible to the current node
     * @return int the number of nodes
     */
    public int getTreeSize() {
        int count = 1;
        for (int i = 0; i < children.length ; i++) {
            if (children[i] != null){
                count += children[i].getTreeSize();
            }
        }
        return count;
    }


}
