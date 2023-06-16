/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let arr = [];
    arr1.forEach(element => {
        arr.push(element["id"]);
    });
    arr2.forEach((element) => {
        if (arr.includes(element["id"])) {
            Object.assign(arr1[arr.indexOf(element["id"])], element);
        } else {
            arr1.push(element);
        }
    })
    return arr1.sort(function (a, b) {
        let ar = a.id;
        let br = b.id;
        if (ar > br) return 1;
        if (ar < br) return -1;
        return 0;
    });
};
