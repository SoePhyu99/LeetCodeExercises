class Solution {
    public String convert(String string, int numRows) {
        if(numRows == 1){
            return string;
        }
        ArrayList<Character>[] arr = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = new ArrayList<Character>();
        }

        int count = 0;
        int divide = (string.length() / numRows) + 2;

        while (divide >= 0) {
            for (int i = 0; i < numRows; i++) {
                if(count < string.length())
                    arr[i].add(string.charAt(count++));
            }
            for (int i = numRows - 2; i > 0; i--) {
                if(count < string.length())
                    arr[i].add(string.charAt(count++));
            }
            divide--;
        }
        
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].size(); j++) {
                result += arr[i].get(j);
            }
        }
        return result;

    }
}