/**
 * @param {number[][]} grid
 * @return {number}
 */
var equalPairs = function(grid) {
    let rows = grid
    let column = [];
    for(let i = 0; i< grid.length ;i++){
        column[i] = [];
    }
    for(let e of grid){
        for(let i = 0; i < e.length; i++){
            column[i].push(e[i]);
        }
    }
    let count = 0;
    for(let e of rows){
        for(let i of column){
            if(check(e, i)){
                count++;
            }
        }
    }
    console.log(rows, column)
    return count;
};

var check = function(a,b){
    if(a.length == 0 || b.length ==0){
        return false;
    }
    for(let e in a){
        if(a[e] != b[e]){
            return false
        }
    }
    return true
}