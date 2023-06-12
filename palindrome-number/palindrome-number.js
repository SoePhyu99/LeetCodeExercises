/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let stringX = `${x}`;
    let half = stringX.length / 2;
    
    let first = stringX.slice(0, half);
    if(stringX.length % 2 == 1){
        half = half + 1;
    }
    let last = stringX.slice(half, stringX.length);
    let index = last.length - 1;
    for(let i = 0; i < half; i++){
        if(first[i] != last[index--]){
            return false;
        }
    }
    return true;
};