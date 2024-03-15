// ask want to see prompt again

prompt(`Enter Your Age --> `);
//confirm(alert("Want to see Prompt again" + "?"));
while (true) {
  if (confirm("Want To See Prompt Again")) {
    prompt(`Enter Your Age --> `);
  } else {
    break;
  }
}
