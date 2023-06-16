/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if(nums.length === 0){
        return init;
    }
    nums.unshift(init);
    return nums.reduce((acc, curr) => {
        return fn(acc, curr);
    });
};