function Queue() {
    let elements = [];
    let steps = 0;

    function enqueue(value) {
        return elements.push(value);
    }

    function dequeue() {
        return elements.shift();
    }

    function isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        return false;
    }

    function front() {
        return elements[0];
    }

    function rear() {
        return elements[elements.length - 1];
    }

    function size() {
        return elements.length;
    }

    function clear() {
        elements = [];
    }

    function values() {
        return elements;
    }

    return {
        enqueue,
        dequeue,
        front,
        rear,
        size,
        clear,
        values,
        isEmpty
    }
}

module.exports = Queue;
