/** @format */

function oddishOrEvenish(number) {
  let sumOfNumber = 0;
  // exceptions
  if (isNaN(number)) {
    throw "Parameter type is not number!";
  }
  if (!Number.isSafeInteger(number)) {
    throw "Parameter is not Integer!";
  }
  if (Math.sign(number) === -1) {
    throw "Parameter is not Positive!";
  }
  // convert to string type for handling sum of digits
  const stringNumber = number.toString();

  for (let i = 0; i < stringNumber.length; i++) {
    const digit = parseInt(stringNumber[i]);
    sumOfNumber += digit;
  }

  if (sumOfNumber % 2 === 0) {
    return "Even";
  } else if (sumOfNumber % 2 === 1) {
    return "Odd";
  }
}

// Test cases
console.log("Test1 :", oddishOrEvenish(43));

console.log("Test2 :", oddishOrEvenish(373));

console.log("Test3 :", oddishOrEvenish(4433));

try {
  console.log("Test4 :", oddishOrEvenish("hello"));
} catch (error) {
  console.log("Test4 :", error);
}

try {
  console.log("Test5 :", oddishOrEvenish(32.15));
} catch (error) {
  console.log("Test5 :", error);
}

try {
  console.log("Test6 :", oddishOrEvenish(-34));
} catch (error) {
  console.log("Test6 :", error);
}
