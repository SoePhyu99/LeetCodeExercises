/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */
var flat = function (arr, n) {
    if(n == 0){
        return arr;
    }
    while (n > 0) {
        let a = [];
        for (let e of arr) {
            if (!Array.isArray(e)) {
                a.push(e);
            } else {
                a.push(...e);
            }
        }
        arr = a;
        n--;
    }
    return arr;
};