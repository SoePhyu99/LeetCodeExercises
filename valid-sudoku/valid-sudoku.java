class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(char[] bor : board){
            List<Character> list = new ArrayList();
            for(char ch:bor){
                if(ch != '.'){
                    list.add(ch);
                }
            }
            if(check(list) == false){
                return false;
            }
        }
        for(int i = 0; i< 9; i++){
            List<Character> list = new ArrayList();
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.')
                    list.add(board[j][i]);
            }
            if(check(list) == false){
                return false;
            }
        }
        int end = 3;
        int start = 0;
        int iend = 3;
        int istart = 0;
        for(int y = 0; y < 9; y++){
            List<Character> list = new ArrayList();
            if(y % 3 == 0){
                istart = y;
                iend = y + 3;
            }
            if(end > 9){
                start = 0;
                end = 3;
            }
            for(int i = istart; i < iend; i++){
                for(int j = start; j < end; j++){
                    if(board[j][i] != '.')
                        list.add(board[j][i]);
                }
            }
            start = end;
            end += 3;
            if(check(list) == false){
                return false;
            }
        }
        
        return true;
    }

    private boolean check(List list){     
        for(int i = 0; i< list.size(); i++){
            for(int j = 0; j< list.size(); j++){
                if(list.get(i) == list.get(j) && j != i){
                    return false;
                }
            }
        }
        return true;
    }
}