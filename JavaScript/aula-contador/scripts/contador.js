contadorStorage = localStorage

const objetoContagem = document.getElementById("contagem-atual")
const incrementarContagem = document.getElementById("incrementar")
const decrementarContagem = document.getElementById("decrementar")
const limparStorage = document.getElementById("limpar-storage")

if (contadorStorage.length === 0) {
  objetoContagem.innerHTML = 0
} else {
  objetoContagem.innerHTML = contadorStorage.value
}

incrementarContagem.addEventListener("click", () => {
  var valorContagem = parseInt(objetoContagem.innerText)
  objetoContagem.innerHTML = valorContagem + 1
  contadorStorage.setItem("value", objetoContagem.innerText)
})

decrementarContagem.addEventListener("click", () => {
  var valorContagem = parseInt(objetoContagem.innerText)
  if (valorContagem > 0) {
    objetoContagem.innerHTML = valorContagem - 1
    contadorStorage.setItem("value", objetoContagem.innerText)
  }
})

limparStorage.addEventListener("click", () => {
  contadorStorage.clear()
  document.location.reload(true)
})


