/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    let count = 0;
    return function(...args){
        console.log(count++);
        if(count < 2){
            return fn(...args);
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */