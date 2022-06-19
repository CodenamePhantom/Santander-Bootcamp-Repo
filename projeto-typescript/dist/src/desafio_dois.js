"use strict";
var newProfissao;
(function (newProfissao) {
    newProfissao[newProfissao["Padeiro"] = 0] = "Padeiro";
    newProfissao[newProfissao["Atriz"] = 1] = "Atriz";
})(newProfissao || (newProfissao = {}));
let pessoa1 = {
    nome: "maria",
    idade: 23,
    profissao: newProfissao.Atriz
};
let pessoa2 = {
    nome: "roberto",
    idade: 44,
    profissao: newProfissao.Padeiro
};
let pessoa3 = {
    nome: "Ana",
    idade: 35,
    profissao: newProfissao.Atriz
};
