const empData = ["Rohit", 1211, "Software Engineer"];

// Skipping the employee name i.e.
function getDetails([, id, designation]) {
  console.log(`Employee ID: ${id}, Designation: ${designation}`);
}
// emp[0] from the array passed
// function getDetails([name, id, designation]) {
//   console.log(`Name: ${name},Employee ID: ${id}, Designation: ${designation}`);
// }

getDetails(empData);
