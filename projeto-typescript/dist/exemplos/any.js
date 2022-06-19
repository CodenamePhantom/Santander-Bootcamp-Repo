"use strict";
let valorAny;
valorAny = 3;
valorAny = "olá";
valorAny = true;
let valorString = "teste";
valorString = valorAny;
let valorString2 = "testão";
valorString2 = valorAny;
function somaString(string1, string2) {
    return string1 + string2;
}
console.log(somaString(valorString, valorString2));
console.log(somaString("ola, ", "mundo"));
