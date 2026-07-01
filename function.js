function createCalculator() {
    function add(firstNumber, secondNumber) {
        const sum = firstNumber + secondNumber;
        return sum;
    }
    function subtract(firstNumber, secondNumber) {
        const difference = firstNumber - secondNumber;
        return difference;
    }
    function multiply(firstNumber, secondNumber) {
        const product = firstNumber * secondNumber;
        return product;
    }
    function divide(firstNumber, secondNumber) {
        if (secondNumber === 0) {
            return "Error Division by zero.";
        } else {
        const divide = firstNumber / secondNumber;
        return divide;
        }
    }
    
    return {
        add,
        subtract,
        multiply,
        divide
    }
}
module.exports = { createCalculator };