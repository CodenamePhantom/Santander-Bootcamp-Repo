"use strict";
const pessoa = {
    nome: "Mariana",
    idade: 28,
    profissao: "desenvolvedora"
};
pessoa.idade = 25;
const andre = {
    nome: "Andre",
    idade: 25,
    profissao: "pintor"
};
const paula = {
    nome: "Paula",
    idade: 28,
    profissao: "Desenvolvedora"
};
var Profissao;
(function (Profissao) {
    Profissao[Profissao["Professora"] = 0] = "Professora";
    Profissao[Profissao["Atriz"] = 1] = "Atriz";
    Profissao[Profissao["Desenvolvedora"] = 2] = "Desenvolvedora";
    Profissao[Profissao["JogadoraDeFutebol"] = 3] = "JogadoraDeFutebol";
})(Profissao || (Profissao = {}));
const vanessa = {
    nome: "Vanessa",
    idade: 31,
    profissao: Profissao.Desenvolvedora
};
const maria = {
    nome: "Maria",
    idade: 21,
    profissao: Profissao.JogadoraDeFutebol
};
const joao = {
    nome: "João",
    idade: 28,
    materias: ["Controle emocional", "Mágica"]
};
function listar(lista) {
    for (const item of lista) {
        console.log(item);
    }
}
listar([maria, vanessa]);
