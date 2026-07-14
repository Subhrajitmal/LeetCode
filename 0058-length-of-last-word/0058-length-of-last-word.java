class Solution {
    public int lengthOfLastWord(String s) {
        String[] word = s.trim().split("\\s+");
        //split the string by spaces into an array of word
        // here .trim() means it remove blank spaces, .split() means cuts the string into separate peaces whenever it finds a specific separator ans here the separator is ("\\s+"), it stands for one or more spaces, and here + treats all those spaces as a single cut.If accidentally typed two or three spaces between the words It stops the code from creating empty, broken words.
        String last = word[word.length-1]; 
        return last.length();
    }
}