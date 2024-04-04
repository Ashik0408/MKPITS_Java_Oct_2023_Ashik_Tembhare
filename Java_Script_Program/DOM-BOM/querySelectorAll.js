 //   let data = document.querySelectorAll(".technocrats");
      //   let len = data.length; //4
      //   for (let i = 0; i < len; i++) {
      //     let result = document.querySelectorAll(".technocrats")[i];
      //     document.write(result + "<br>");
      //     console.log(result);
      //   }

      //by using for of loop
      let data = document.querySelectorAll(".technocrats, .myclass, #show");
      for (const element of data) {
        document.write(element + "<br>");
        console.log(element);