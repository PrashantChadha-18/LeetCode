class Solution {
    public String restoreString(String s, int[] indices) {
        char[] j=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            j[indices[i]]=s.charAt(i);
        }
        return new String(j);
    }
}