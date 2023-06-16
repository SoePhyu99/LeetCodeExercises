/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) {
    let output = [];
    let temp = [];
    for(let i = 0; i < arr.length; i++){
        temp.push(arr[i]);
        if((i+1) % size === 0){
            output.push(temp);
            temp = [];
        }
    }
    if(temp.length !== 0){
        output.push(temp);
    }
    return output;
};