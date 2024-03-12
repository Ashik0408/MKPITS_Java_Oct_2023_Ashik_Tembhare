const a = { harry: 98, rohan: 70, akash: 60 };

for (let index = 0; index < Object.keys(a).length; index++) {
  let key = Object.keys(a)[index]; // get the current key of object 'a'
  console.log(`${key} : ${a[key]}`); // print the key and it's value
}
