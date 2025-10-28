class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int res[] = new int[friends.length];
        int i = 0;
        for(int k : order)
        for(int y : friends)
        if(k==y)
        res[i++]= y;
        return res;
    }
}