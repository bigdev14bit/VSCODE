const prompt = require('prompt-sync')();

function createCalculator() {

  function add(firstNumber, secondNumber) {
    return firstNumber + secondNumber;
  }

  function subtract(firstNumber, secondNumber) {
    return firstNumber - secondNumber;
  }

  function multiply(firstNumber, secondNumber) {
    return firstNumber * secondNumber;
  }

  function divide(firstNumber, secondNumber) {
    if (secondNumber === 0) {
      return "Error Division by zero.";
    } else {
    return firstNumber / secondNumber;
    }
  }
}

const userInput = Number(prompt("Enter the first number: "));
const operator = prompt("Enter the operation (add, subtract, multiply, divide): ");
const userInput2 = Number(prompt("Enter the second number: "));

if(operator === "+") {
    createCalculator().add(userInput, userInput2);
}
else if(operator === "-") {
    createCalculator().subtract(userInput, userInput2);
}
else if(operator === "*") {
    createCalculator().multiply(userInput, userInput2);
}
else if(operator === "/") {
    if(userInput2 === 0) {
        console.log("Error Division by zero.");
    } else {
    createCalculator().divide(userInput, userInput2);
    }
}