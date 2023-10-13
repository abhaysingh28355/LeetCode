class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp>0){
            int r = temp % 10;
            temp = temp /10;
            rev = rev*10+r;
        }
        
        if(x == rev){
            return true;
        }
        else{
            return false;
        
        } 
    }
}