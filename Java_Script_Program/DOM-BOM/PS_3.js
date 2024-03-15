let age = prompt(`enter your age`);
while (true) {
  if (age < 0) {
    console.error(`you entered negetive value, please enter a positive number`);
    confirm("Want To See Prompt Again")
  }
  if (confirm("Want To See Prompt Again")) {
    prompt(`Enter Your Age --> `);
  } else {
    break;
  }
}
