package model;

public class ComputadorMesa extends Computador {
    // Constantes
    public final static int CAMERA = 80000;
    public final static int KEYBOARD = 160000;
    // Atributos
    private int keyboard;
    private int camera;

    // Metodos
    public ComputadorMesa() {
        super();
        this.camera = CAMERA;
        this.keyboard = KEYBOARD;
    }

    /**
     * Constructor de la clase ComputadorMesa que usa un parametro
     * <p>
     * El atributo extraCharger se inicializa usando la constante EXTRA_CHARGER
     *
     * @param camera
     */
    public ComputadorMesa(int camera) {
        super();
        this.camera = camera;
        this.keyboard = KEYBOARD;
    }

    /**
     * Constructor de la clase ComputadorMesa que usa tres parametros
     *
     * @param camera
     * @param keyboard
     */

    public ComputadorMesa(int keyboard, int camera) {
        this.keyboard = keyboard;
        this.camera = camera;
    }

    /**
     * Metodo sobrecargado desde la clase padre (Computador)
     * <p>
     *
     * @return super.calcularPrecio() + camera + keyboard;
     */
    @Override

    public double calcularPrecio() {
        double precioTotal = 0.0;
        precioTotal = super.calcularPrecio() + this.keyboard + this.camera;
        return precioTotal;
    }
    public static int getCamera() {
        return CAMERA;
    }
    public static int getKeyboard() {
        return KEYBOARD;
    }
    public void setCamera(int camera) {
        this.camera = camera;
    }
    public void setKeyboard(int keyboard) {
        this.keyboard = keyboard;
    }
}
