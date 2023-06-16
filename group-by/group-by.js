/**
 * @param {Function} fn
 * @return {Array}
 */
Array.prototype.groupBy = function(fn) {
    let obj = {};
    for(let e of this){
        let key = fn(e);
        if(obj[key] == null){
            obj[key] = [];
        }
        obj[key].push(e);
    }
    return obj;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */