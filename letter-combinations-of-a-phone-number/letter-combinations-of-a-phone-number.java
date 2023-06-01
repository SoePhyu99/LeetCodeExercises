class Solution {
    Map<Integer, List<Character>> map = new HashMap();
    public List<String> letterCombinations(String digits) {
        char ch = 97;
        for(int i = 2; i < 10; i++){
            List<Character> character = new ArrayList();
            int count = 3;
            if(i == 7 || i == 9){
                count = 4;
            }
            while(count > 0){
                character.add((char)ch);
                ch++;
                count--;
            }
            map.put(i, character);
        }
        List<String> temp = new ArrayList<>();
        if(digits.length() > 0){
            for (char c : map.get(digits.charAt(0) - '0')) {
                temp.add(c+"");
            }
            int x = 0;
            while (x < digits.length() - 1) {
                List<String> current = new ArrayList<>();
                for (String c : temp) {
                    for (char cc : map.get(digits.charAt(x + 1) - '0')) {
                        current.add(c + "" + cc);
                    }
                }
                temp = current;
                x++;
            }
        }
        return temp;
    }
}