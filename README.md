# random-words
Implements a random pronuouncable English word generation algorithm by training a model using a dictionary of English words.
Core steps of the aglorithm:
1. Train a model using an English dictionary
2. Store the characters that typically follow a certain sequence of words in the English language using a Char Bag data structure
3. Create random words by using the current segment of a word and choosing and weight random next char based on the counts of each char in the charbag for a given word sequence
# How-to
1. Download LetterSample.java, CharBag.java, Gibberisher.java, Trie.java, and TrieNode.java
2. Move into src
3. Download the Dictionary text file which will be used to train a sample
4. Run the GibberisherMain
