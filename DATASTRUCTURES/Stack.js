 function stack() {
    let array = [];
    let top = 0

    function push(value) {
        array.push(value);
        top++;
    }

    function pop() {
        return array[--top];
    }

    function peek() {
        return array[top - 1];
    }

    function isEmpty() {
        if (top == 0) {
            return true;
        }
        return false;
    }

    function size() {
        return top;
    }

    function clear() {
        let element = []; 
        return element;                                                                
    }

    function value() {
        return array;
    }

    return {
        push,
        pop,
        peek,
        isEmpty,
        size,
        clear,
        value
    }

}
module.exports = stack;