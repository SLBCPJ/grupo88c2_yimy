package model;
/**
 * Computador
 */
public class Computador {
    /*
     * Constantes
     */
    public static final double PRECIO_BASE = 1500000;
    public static final double PRECIO_MOUSE = 60000;
    public static final double PRECIO_HEADPHONE = 110000;
    // ATRIBUTOS
    protected double mouse;
    protected double headphone;
    protected double precioBase;

    // metodos
    public Computador() {
        super();
        this.precioBase = PRECIO_BASE;
        this.mouse = PRECIO_MOUSE;
        this.headphone = PRECIO_HEADPHONE;
    }

    /**
     * Constructor de la clase PC que usa dos parametros
     * <p>
     * El mouse se inicializa usando la constante PRECIO_MOUSE
     * 
     * @param precioBase
     * @param headphone
     */
    public Computador(double headphone, double precioBase) {
        this.headphone = headphone;
        this.precioBase = precioBase;
        this.mouse = PRECIO_MOUSE;
    }

    /**
     * Constructor de la clase Computador que usa tres parametros
     * 
     * @param precioBase
     * @param headphone
     * @param mouse
     */
    public Computador(double mouse, double headphone, double precioBase) {
        this.mouse = mouse;
        this.headphone = headphone;
        this.precioBase = precioBase;
    }

    /**
     * Metodo para calcular el total del precio del Computador
     * 
     * @return precioBase + mouse + headphone;
     */

    public double calcularPrecio() {
        double precioFinal = 0.0;
        precioFinal = this.mouse + this.headphone + this.precioBase;
        return precioFinal;
    }
    public double getHeadphone() {
        return headphone;
    }
    public double getMouse() {
        return mouse;
    }
    public double getPrecioBase() {
        return precioBase;
    }
    public void setHeadphone(double headphone) {
        this.headphone = headphone;
    }
    
    public void setMouse(double mouse) {
        this.mouse = mouse;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

}
