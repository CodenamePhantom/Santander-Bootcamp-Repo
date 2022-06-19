function somaValoresNumericos(numero1: number, numero2: number): number {
  return numero1 + numero2;
}

console.log(somaValoresNumericos(12554268, 232124573));

function somaValoresVoid(numero1: number, numero2: number): void {
  console.log(numero1 + numero2);
}

somaValoresVoid(7489296, 48645896);

function somaValoresNumericosTratar(numero1: number, numero2: number, callback: (numero: number) => number): number {
  let resultado = numero1 + numero2;
  return callback(resultado);
}

function aoQuadrado(numero: number): number {
  return numero * numero;
}

function dividirPorEleMesmo(numero: number): number {
  return numero / numero;
}

console.log(somaValoresNumericosTratar(1242, 48515, aoQuadrado));
console.log(somaValoresNumericosTratar(1242, 48515, dividirPorEleMesmo));
