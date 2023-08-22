public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero(5, 10, 2.5);

        Carro carro1 = new Carro("ABC123", "Toyota", "Corolla");
        Carro carro2 = new Carro("DEF456", "Honda", "Civic");
        Carro carro3 = new Carro("GHI789", "Ford", "Focus");

        parqueadero.parquearCarro(carro1, 0, 2);
        parqueadero.parquearCarro(carro2, 2, 5);
        parqueadero.parquearCarro(carro3, 4, 9);

        System.out.println("Estado actual del parqueadero:");
        parqueadero.mostrarEstadoParqueadero();

        System.out.println("\nCosto por tiempo de estacionamiento:");
        System.out.println("Carro 1: $" + parqueadero.cobrarPorTiempo(carro1, 3));
        System.out.println("Carro 2: $" + parqueadero.cobrarPorTiempo(carro2, 2));

        System.out.println("\nIntento de parquear un carro en un espacio ocupado:");
        System.out.println(parqueadero.parquearCarro(carro2, 2, 5)); // Debería retornar false
    }
}