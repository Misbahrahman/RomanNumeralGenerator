public class intToRoman {
    //Pure Algo File
    public static String intToRoman(int number) {

        //storing different digit
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};

        //storing diffrent values
        String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        //ans string
        String ans = "";

        for(int i= 0 ; i < nums.length ; i++) {
            while(number >= nums[i]) {
                number -= nums[i];
                ans += values[i];
            }
        }

        return ans;
    }

}
