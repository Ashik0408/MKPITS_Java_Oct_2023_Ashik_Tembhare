function randomNumberGenerator() {
  const randomNumbers = [];
  while (randomNumbers.length < 25) {
    const number = Math.floor(Math.random() * 25) + 1;
    if (!randomNumbers.includes(number)) {
      randomNumbers.push(number);
    }
  }

  const createDiv = document.getElementById("container");
  createDiv.innerHTML = "";
  for (let number of randomNumbers) {
    const gridItem = document.createElement("div");
    gridItem.classList.add("grid-item");
    gridItem.textContent = number;
    createDiv.appendChild(gridItem);
  }
}
