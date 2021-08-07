package model;

public class ComputadorPortatil extends Computador {
    /**
     * Constantes
     */
    public static final int EXTRA_BATERY = 100000;
    public static final int EXTRA_CHARGER = 80000;
    /**
     * Atributos
     */
    private int extraBatery;
    private int extraCharger;

    /**
     * Constructores
     */

    
    /**
     * Constructor
     * <p>
     * inicializa los atributos asingandole a cada uno la constante correspondiente
     */
    public ComputadorPortatil() {
        super();
        this.extraBatery = EXTRA_BATERY;
        this.extraCharger = EXTRA_CHARGER;
    }

    /**
     * Constructor de la clase ComputadorPortatil que usa un parametro
     * <p>
     * El atributo extraCharger se inicializa usando la constante EXTRA_CHARGER
     *
     * @param extraBatery
     */
    public ComputadorPortatil(int extraBatery) {
        super();
        this.extraBatery = extraBatery;
        this.extraCharger = EXTRA_CHARGER;
    }

    
    /**
     * Constructor de la clase ComputadorPortatil que usa tres parametros
     *
     * @param extraBatery
     * @param extraCharger
     */
    public ComputadorPortatil(int extraCharger, int extraBatery) {
        super();
        this.extraCharger=extraCharger;
        this.extraBatery=extraBatery;
    }

    /**
     * Metodo sobrecargado desde la clase padre (Computador)
     * <p>
     *
     * @return super.calcularPrecio() + extraBatery + extraCharger;
     */
    @Override

    public double calcularPrecio() {
        double precioTotal = 0.0;
        precioTotal =  super.calcularPrecio()+this.extraBatery+this.extraCharger;
        return precioTotal;
    }
    public static int getExtraBatery() {
        return EXTRA_BATERY;
    }
    public static int getExtraCharger() {
        return EXTRA_CHARGER;
    }
    public void setExtraBatery(int extraBatery) {
        this.extraBatery = extraBatery;
    }
    public void setExtraCharger(int extraCharger) {
        this.extraCharger = extraCharger;
    }
}




