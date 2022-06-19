const pessoa = {
  nome: "Mariana",
  idade: 28,
  profissao: "desenvolvedora"
}

pessoa.idade = 25;

const andre: {nome: string, idade: number, profissao: string} = {
  nome: "Andre",
  idade: 25,
  profissao: "pintor"
}

const paula: {nome: string, idade: number, profissao: string} = {
  nome: "Paula",
  idade: 28,
  profissao: "Desenvolvedora"
}

enum Profissao {
  Professora,
  Atriz,
  Desenvolvedora,
  JogadoraDeFutebol
}

interface Pessoa {
  nome: string,
  idade: number,
  profissao?: Profissao
}

interface Estudante extends Pessoa {
  materias: string[]
}

const vanessa: Pessoa = {
  nome: "Vanessa",
  idade: 31,
  profissao: Profissao.Desenvolvedora
}

const maria: Pessoa = {
  nome: "Maria",
  idade: 21,
  profissao: Profissao.JogadoraDeFutebol
}

const joao: Estudante = {
  nome: "João",
  idade: 28,
  materias: ["Controle emocional", "Mágica"]
}

function listar(lista: Pessoa[]) {
  for (const item of lista) {
      console.log(item)
  }
}

listar([maria, vanessa])
