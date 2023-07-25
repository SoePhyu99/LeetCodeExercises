/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let newArr = [];
    newArr.length = matrix.length;
    for(let i = 0; i< newArr.length; i++){
        newArr[i] = [];
    }
    for(let j = matrix.length - 1; j >= 0; j--){
        for(let i = 0; i < matrix.length; i++){
            newArr[i].push(matrix[j][i]);
        }
    }
    let index = 0;
    newArr.map((arr) => matrix[index++] = arr);
};