/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    arr.sort(function(a,b){
        let first = fn(a);
        let second = fn(b);

        if(first > second) return 1;
        if(first < second) return -1;
        return 0;
    })
    return arr;
};