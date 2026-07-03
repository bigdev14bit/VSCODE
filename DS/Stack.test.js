const myStack = require("./Stack");

test("if stack is empty", ()=> {

    const newStack = new myStack();
    expect(newStack.isEmpty()).toBe(true);
})

test("that i can push", ()=> {

    const newStack = myStack();
    newStack.push(100);
    expect(newStack.isEmpty()).toBe(false);
})

test("that i can push more than one element", ()=> {
    const newStack = myStack();

    newStack.push(100);
    newStack.push(20);
    newStack.push(70);
    
    expect(newStack.size()).toBe(3);
})

test("that i can pop", ()=> {
    const newStack = myStack();
    newStack.push(20);
    newStack.push(100);
    newStack.push(30);

    expect(newStack.pop()).toBe(30);
})

test("that i can pop more that one elements", ()=> {
    const newStack = myStack();

    newStack.push(20);
    newStack.push(100);
    newStack.push(30);
    newStack.push(55);

    expect(newStack.size()).toBe(4);
    newStack.pop();
    newStack.pop();

    expect(newStack.size()).toBe(2);
})

test("that i can peek into my stack", ()=> {
    const newStack = myStack();

    newStack.push(20);
    newStack.push(100);
    newStack.push(30);
    newStack.push(55);

    newStack.peek();
    expect(newStack.peek()).toBe(55);
})

test("that i my stack size increase", ()=> {
    const newStack = myStack();

    newStack.push(20);
    newStack.push(100);
    newStack.push(30);
    newStack.push(55);

    expect(newStack.size()).toBe(4);
})

test("that i my stack size decrease", ()=> {
    const newStack = myStack();

    newStack.push(20);
    newStack.push(100);
    newStack.push(30);
    newStack.push(55);

    newStack.pop();
    newStack.pop();

    expect(newStack.size()).toBe(2);
})

//test("that i can clear my stack", ()=> {
    //const newStack = myStack();
    
    //newStack.push(20);
    //newStack.push(100);
    //newStack.push(30);
    //newStack.push(55);

    //newStack.clear();
    //expect(newStack.isEmpty()).toBe(true);
//})

test("test that i can see all elements in my stack", ()=> {
    const newStack = myStack();

    newStack.push(20);
    newStack.push(100);
    newStack.push(30);
    newStack.push(55);

    expect(newStack.value()).toStrictEqual([20, 100, 30, 55]);
})