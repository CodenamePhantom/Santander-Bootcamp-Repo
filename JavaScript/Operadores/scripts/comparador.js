const form = document.getElementById("comparador")
const outputField = document.getElementById("output")

var formData = new FormData(form)

form.addEventListener("submit", event => {
  event.preventDefault();

  var firstNum = form.elements["numero-um"].value
  var secondNum = form.elements["numero-dois"].value

  if (firstNum === "" || secondNum === "") {
    outputField.innerText = "Engraçadinho..."
  } else {
    var numberSum = parseInt(firstNum) + parseInt(secondNum)
    var outputString = `Os números ${firstNum} e ${secondNum} ${firstNum === secondNum ?
        "são iguais" :
        "não são iguais"
      }. Sua soma é ${numberSum}, que é ${numberSum < 10 ?
        "menor" :
        numberSum === 10 ?
          "igual" :
          "maior"
      } que 10 e ${numberSum < 20 ?
        "menor" :
        numberSum === 20 ?
          "igual" :
          "maior"
      } que 20`
    outputField.innerText = outputString
  }
})
