class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
		String result = "";
		int i = 1;
		while (num != 0) {
			int number = (num % 10) * i;
			if(map.get(number) == null){
				String current = "";
				if(num % 10 < 4){
					current = getSmallNum(number, map.get(i), i);
				}else{
					current = map.get(5 * i) + getSmallNum(number - (5 * i), map.get(i), i);
				}
				result = current + result;
			}else{
				result = map.get(number) + result;
			}
			i *= 10;
			num = num / 10;
		}
        return result;
    }
	private String getSmallNum(int x, String aja, int i){
		String result = "";
		x = x / i;
		while(x > 0){
			result += aja;
			x--;
		}
		return result;
	}
    
}