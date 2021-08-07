package model;

/**
 * PrecioTotal
 */
public class PrecioTotal {
    // Atributos
    private int totalPCs;
    private int totalLaptops;
    private int totalDesktops;
    private Computador PC[];

    // metodos
    public PrecioTotal() {
        this.totalPCs = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
    }

    public PrecioTotal(Computador[] pC) {
        this.totalPCs = 0;
        this.totalLaptops = 0;
        this.totalDesktops = 0;
        this.PC = pC;
    }

    public void mostrarTotales() {
        /*
         * Recorrido de la lista de computadores para acumular el precio usar instanceof
         * para comparar el tipo de computador
         */
        for (Computador compu : PC) {
            if (compu instanceof Computador) {
                totalPCs += compu.calcularPrecio();
            }
            if (compu instanceof ComputadorPortatil) {
                totalLaptops += compu.calcularPrecio();
            }if (compu instanceof ComputadorMesa) {
                totalDesktops += compu.calcularPrecio();
            }
        }
        System.out.println("El precio total de los computadores es de " + totalPCs);       
        System.out.println("La suma del precio de los ComputadorPortatil es de " + totalLaptops);
        System.out.println("La suma del precio de los ComputadorMesa es de " + totalDesktops);
    }
}