class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd = 0;
        int dd = 0;
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            if(n>=0 && n<=9){
                sd+=n;
            }else{
                dd+=n;
            }
        }
        if(sd==dd){
            return false;
        }
        return true;
    }
}