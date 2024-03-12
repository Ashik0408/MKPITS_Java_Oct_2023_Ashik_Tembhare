const num = [45, 50, 55, 2];
console.log("Original array--->", num);
let newArray = num.map((value) => {
  return value * 2;
});
console.log("New Array Values-->", newArray.sort());
