public class Main {
    public static void main(String[] args) {
        Carros fiesta = new Carros("vermelho", "Fiesta", 100);
        Carros gol = new Carros();
        gol.setCor("verde");
        gol.setModelo("Gol");
        gol.setCapacidadeDoTanque(150);
        Carros uninhoEscada = new Carros("branco", "Uno", 2500);

        printCarro(fiesta.getCor(), fiesta.getModelo(), fiesta.getCapacidadeDoTanque());
        printCarro(gol.getCor(), gol.getModelo(), gol.getCapacidadeDoTanque());
        printCarro(uninhoEscada.getCor(), uninhoEscada.getModelo(), uninhoEscada.getCapacidadeDoTanque());

        System.out.println("Valor para encher o tanque do fiesta: " + fiesta.totalValorTanque(6.54));
        System.out.println("Valor para encher o tanque do gol: " + gol.totalValorTanque(6.54));
        System.out.println("Valor para encher o tanque do uninho zika do baile: " + uninhoEscada.totalValorTanque(6.54) + " (mto rico rsrs)");
    }

    private static void printCarro(String modeloDoCarro, String corDoCarro, int capacidadeDoCarro) {
        System.out.println("Modelo: " + modeloDoCarro +
                "\nCor: " + corDoCarro +
                "\nCapacidade do Tanque: " + capacidadeDoCarro);
    }
}