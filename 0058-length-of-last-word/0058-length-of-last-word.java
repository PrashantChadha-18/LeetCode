class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        int last=0;
        for(String w: word)
        {
            last=w.length();
        }
        return last;
    }
}