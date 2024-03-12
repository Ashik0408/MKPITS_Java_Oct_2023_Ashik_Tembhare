const number = [1, 2, 3, 4, 8, 9, 7];
console.log("Before splice--->", number);
number.splice(0, 2); //removing the first two elements from array starting at index 0 and removing 2 element
console.log("After splice--->", number);

number.splice(2, 0, 12, 45, 80); // adding element without removing element  in given position
// here we are not removing any element but just adding new one
console.log("After adding element--->", number);
