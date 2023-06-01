class Solution {
    public int reverse(int x) {
        long j = 1;
        long y = new Long(x);
        long z = new Long(x);
        long result = 0;
        if((x < 10 && x > 0) || (x < 0 && x > -10)){
            return x;
        }
        else if(x < 0){
            while(y < 0){
                j = j * 10;
                y = y / 10;
            }
            while(j > 1){
                j = j / 10;
                result = result - (x % 10) * j;
                x = x / 10;
            }
            result = result * (-1);
        }else{
            while(y > 0){
                j = j * 10;
                y = y / 10;
            }
            System.out.println(j);
            while(j > 1){
                j = j / 10;
                result = result + (x % 10) * j;
                x = x / 10;
            }
        }
        if(result > 2147483647 || result < -2147483647){
            return 0;
        }
        return (int)result;
    }
}