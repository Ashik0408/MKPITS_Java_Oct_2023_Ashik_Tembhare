console.log("Adding Key Value Pair ---->");
const obj = {
  name: "Ashik",
};
console.log(obj);
obj.age = 25; // Adding a new key value pair to the object
console.log(obj);
obj.age = 26; //Updating an existing key with a new value
console.log(obj);
obj["email"] = "ashik@gmail.com"; //Adding
console.log(obj);
Object.assign(obj, { country: "Bangladesh" }); //Adding using Object.Ass
console.log(obj);
