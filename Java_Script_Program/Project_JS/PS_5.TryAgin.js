let sysInput = Math.ceil(Math.random() * 100);
let attempt = 1;
//console.log(sysInput);

while (true) {
  let userInput = parseInt(prompt(`Guss the number between 1 to  100`));
  if (userInput == sysInput) {
    alert(
      `Congrats You Guessed it Right And Your Attempt is--->${attempt}<---`
    );
    break;
  } else if (userInput < sysInput) {
    alert("Your Input is too low.....Try Again");
    attempt++;
    continue;
  } else {
    //if user input is greater than system generated random number then show this message
    alert("Your Input is too high......Try again");
    attempt++;
    continue;
  }
}
