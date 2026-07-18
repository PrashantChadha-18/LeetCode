class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb=new StringBuffer();
        StringBuffer arr=new StringBuffer();
        for(int i=0;i<word1.length;i++)
        {
            sb.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++)
        {
            arr.append(word2[i]);
        }
        if(sb.toString().equals(arr.toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}