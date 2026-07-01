const { createCalculator } = require("./function");
let {add, subtract, multiply, divide} = createCalculator();

test("that i can add two numbers", () => {
  let firstNumber = 4;
  let secondNumber = 6;

  const result = add(firstNumber, secondNumber);
  expect(result).toBe(10);
})

test("that i can add two negative numbers", () => {
  let firstNumber = -4;
  let secondNumber = -6;

  const result = add(firstNumber, secondNumber);
  expect(result).toBe(-10);
});

test("that i can subtract two numbers", () => {
  let firstNumber = 6;
  let secondNumber = 4;

  const result = subtract(firstNumber, secondNumber);
  expect(result).toBe(2);
})

test("that i can multiply two numbers", () => {
  let firstNumber = 4;
  let secondNumber = 6;

  const result = multiply(firstNumber, secondNumber);
  expect(result).toBe(24);
})

test("that i can multiply two negative numbers", () => {
  let firstNumber = -4;
  let secondNumber = -6;

  const result = multiply(firstNumber, secondNumber);
  expect(result).toBe(24);
})

test("that i can divide two numbers", () => {
  let firstNumber = 16;
  let secondNumber = 4;

  const result = divide(firstNumber, secondNumber);
  expect(result).toBe(4);
})

test("that i can divide two numbers, a whole and a zero", () => {
  let firstNumber = 100;
  let secondNumber = 0;

  const result = divide(firstNumber, secondNumber);
  expect(result).toBe("Error Division by zero.");
})
