public class Parqueadero {
    private Carro[][] matrizParqueadero;
    private double tarifaPorHora;

    public Parqueadero(int filas, int columnas, double tarifaPorHora) {
        matrizParqueadero = new Carro[filas][columnas];
        this.tarifaPorHora = tarifaPorHora;
    }

    public boolean parquearCarro(Carro carro, int fila, int columna) {
        if (fila < 0 || fila >= matrizParqueadero.length ||
                columna < 0 || columna >= matrizParqueadero[0].length ||
                matrizParqueadero[fila][columna] != null) {
            return false; // Espacio ocupado o fuera de límites
        }

        matrizParqueadero[fila][columna] = carro;
        return true;
    }

    public double cobrarPorTiempo(Carro carro, int horas) {
        return horas * tarifaPorHora;
    }

    public void mostrarEstadoParqueadero() {
        for (int fila = 0; fila < matrizParqueadero.length; fila++) {
            for (int columna = 0; columna < matrizParqueadero[0].length; columna++) {
                if (matrizParqueadero[fila][columna] != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}