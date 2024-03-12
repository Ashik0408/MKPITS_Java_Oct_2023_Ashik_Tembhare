const num = [1, 2, 3, 4, 5];
console.log("Only Values---->");
num.forEach((value) => {
  console.log(value);
});
console.log("--------Values With Index----------");
num.forEach((value, index) => {
  console.log(value, "-->", index);
});
console.log("--------Values With Index and Array----------");
num.forEach((v, i, a) => {
  console.log(v, "-->", i, " --->", a);
});
