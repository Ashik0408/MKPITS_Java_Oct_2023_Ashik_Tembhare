let name = prompt(`Enter Any Name--->`);
let index = 4;
if (name.length >= 4) {
  for (let i = 0; i < name.length; i++) {
    if (i == index - 1) {
      alert(`Replace charecter Name is ${name.replace(name.charAt(i), `A`)}`);
    }
} else {
  alert(`Name Length is Short`);
}
