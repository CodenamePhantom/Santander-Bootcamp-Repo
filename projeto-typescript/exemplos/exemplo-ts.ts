const BUTTON = document.getElementById("btn");
const INPUT_ONE = document.getElementById("input1") as HTMLInputElement;
const INPUT_TWO = document.getElementById("input2") as HTMLInputElement;

function adicionarNumero(numero1: number, numero2: number, devPrintar: boolean, frase: string) {
  let resultado = numero1 + numero2 
  if (devPrintar) {
    console.log(frase + resultado);
  }
  return numero1 + numero2;
}

let devPrintar = true;
let frase = "O valor é: "

if (BUTTON) {
  BUTTON.addEventListener("click", () => {
    if (INPUT_ONE && INPUT_TWO) {
      console.log(adicionarNumero(Number(INPUT_ONE.value), Number(INPUT_TWO.value), devPrintar, frase));
    }
  });
}
