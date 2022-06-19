enum newProfissao {
  Padeiro,
  Atriz
}

interface newPessoa {
  nome: string,
  idade: number,
  profissao: newProfissao 
}

let pessoa1: newPessoa = {
  nome: "maria",
  idade: 23,
  profissao: newProfissao.Atriz
}
let pessoa2: newPessoa = {
  nome: "roberto",
  idade: 44,
  profissao: newProfissao.Padeiro
}
let pessoa3: newPessoa = {
  nome: "Ana",
  idade: 35,
  profissao: newProfissao.Atriz
}
