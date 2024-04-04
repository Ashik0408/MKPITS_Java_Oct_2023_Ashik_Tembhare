// targetElement.insertAdjacentElement("position", element)
// position : 'beforebegin' | 'afterbegin' | 'beforeend' | 'afterend'
var parentNode = document.getElementById("mydiv");
var h = document.getElementById("myh2");
var newElement = document.createElement("span");
newElement.textContent = "This is span";
h.insertAdjacentElement("beforebegin", newElement);
h.insertAdjacentElement("afterend", newElement);
h.insertAdjacentElement("afterbegin", newElement);
h.insertAdjacentElement("beforeend", newElement);
console.log(parentNode);
