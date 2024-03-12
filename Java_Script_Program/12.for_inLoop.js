const studDetails = {
  Name: `Ashik`,
  Age: 25,
  City: `Nagpur`,
};

// fetching keys by for-in loop
for (const key in studDetails) {
  console.log(key, ":", studDetails[key]);
}
