const myQueue = require("./Queue");

test("that queue is empty", ()=> {

    const newQueue = new myQueue;
    expect(newQueue.isEmpty()).toBe(true);

    
})

test("that i can dequeue", ()=> {
    const newQueue = myQueue();
})