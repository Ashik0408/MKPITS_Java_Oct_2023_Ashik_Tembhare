let myarr = [];

for (let index = 0; ; index++) {
  let array = [prompt(`enter ${index + 1} array`)];

  if (array != 0) {
    myarr.push(array);
  } else {
    alert(`Element should greater than "0"`);
    break;
  }
}
console.log(myarr);
alert(myarr);
