package model;

public class TodoElCodigo {
    /**
 * PrecioTotal
 */
// public class PrecioTotal {
//     // Atributos
//     private double totalPCs;
//     private double totalLaptops;
//     private double totalDesktops;
//     private Computador PC[];

//     // metodos
//     public PrecioTotal() {
//         this.totalPCs = 0.0;
//         this.totalLaptops = 0.0;
//         this.totalDesktops = 0.0;
//     }

//     public PrecioTotal(Computador[] pC) {
//         this.totalPCs = 0.0;
//         this.totalLaptops = 0.0;
//         this.totalDesktops = 0.0;
//         this.PC = pC;
//     }

//     public void mostrarTotales() {
//         /*
//          * Recorrido de la lista de computadores para acumular el precio usar instanceof
//          * para comparar el tipo de computador
//          */
//         for (Computador compu : PC) {
//             if (compu instanceof Computador) {
//                 totalPCs += compu.calcularPrecio();
//             }
//             if (compu instanceof ComputadorPortatil) {
//                 totalLaptops += compu.calcularPrecio();
//             }if (compu instanceof ComputadorMesa) {
//                 totalDesktops += compu.calcularPrecio();
//             }
//         }
//         System.out.println("El precio total de los computadores es de " + totalPCs);       
//         System.out.println("La suma del precio de los Laptops es de " + totalLaptops);
//         System.out.println("La suma del precio de los Desktops es de " + totalDesktops);
//     }
// }


// /**
//  * Computador
//  */
// public class Computador {
//     /*
//      * Constantes
//      */
//     public static final double PRECIO_BASE = 1500000;
//     public static final double PRECIO_MOUSE = 60000;
//     public static final double PRECIO_HEADPHONE = 110000;
//     // ATRIBUTOS
//     protected double mouse;
//     protected double headphone;
//     protected double precioBase;

//     // metodos
//     public Computador() {
//         super();
//         this.precioBase = PRECIO_BASE;
//         this.mouse = PRECIO_MOUSE;
//         this.headphone = PRECIO_HEADPHONE;
//     }

//     /**
//      * Constructor de la clase PC que usa dos parametros
//      * <p>
//      * El mouse se inicializa usando la constante PRECIO_MOUSE
//      * 
//      * @param precioBase
//      * @param headphone
//      */
//     public Computador(double headphone, double precioBase) {
//         this.headphone = headphone;
//         this.precioBase = precioBase;
//         this.mouse = PRECIO_MOUSE;
//     }

//     /**
//      * Constructor de la clase Computador que usa tres parametros
//      * 
//      * @param precioBase
//      * @param headphone
//      * @param mouse
//      */
//     public Computador(double mouse, double headphone, double precioBase) {
//         this.mouse = mouse;
//         this.headphone = headphone;
//         this.precioBase = precioBase;
//     }

//     /**
//      * Metodo para calcular el total del precio del Computador
//      * 
//      * @return precioBase + mouse + headphone;
//      */

//     public double calcularPrecio() {
//         double precioFinal = 0.0;
//         precioFinal = this.mouse + this.headphone + this.precioBase;
//         return precioFinal;
//     }

// }




// public class ComputadorMesa extends Computador {
//     // Constantes
//     public final static int CAMERA = 80000;
//     public final static int KEYBOARD = 160000;
//     // Atributos
//     private int keyboard;
//     private int camera;

//     // Metodos
//     public ComputadorMesa() {
//         super();
//         this.camera = CAMERA;
//         this.keyboard = KEYBOARD;
//     }

//     /**
//      * Constructor de la clase ComputadorMesa que usa un parametro
//      * <p>
//      * El atributo extraCharger se inicializa usando la constante EXTRA_CHARGER
//      *
//      * @param camera
//      */
//     public ComputadorMesa(int camera) {
//         super();
//         this.camera = camera;
//         this.keyboard = KEYBOARD;
//     }

//     /**
//      * Constructor de la clase ComputadorMesa que usa tres parametros
//      *
//      * @param camera
//      * @param keyboard
//      */

//     public ComputadorMesa(int keyboard, int camera) {
//         this.keyboard = keyboard;
//         this.camera = camera;
//     }

//     /**
//      * Metodo sobrecargado desde la clase padre (Computador)
//      * <p>
//      *
//      * @return super.calcularPrecio() + camera + keyboard;
//      */
//     @Override

//     public double calcularPrecio() {
//         double precioTotal = 0.0;
//         precioTotal = super.calcularPrecio() + this.keyboard + this.camera;
//         return precioTotal;
//     }
// }




// public class ComputadorPortatil extends Computador {
//     /**
//      * Constantes
//      */
//     public static final int EXTRA_BATERY = 100000;
//     public static final int EXTRA_CHARGER = 80000;
//     /**
//      * Atributos
//      */
//     private int extraBatery;
//     private int extraCharger;

//     /**
//      * Constructores
//      */

    
//     /**
//      * Constructor
//      * <p>
//      * inicializa los atributos asingandole a cada uno la constante correspondiente
//      */
//     public ComputadorPortatil() {
//         super();
//         this.extraBatery = EXTRA_BATERY;
//         this.extraCharger = EXTRA_CHARGER;
//     }

//     /**
//      * Constructor de la clase ComputadorPortatil que usa un parametro
//      * <p>
//      * El atributo extraCharger se inicializa usando la constante EXTRA_CHARGER
//      *
//      * @param extraBatery
//      */
//     public ComputadorPortatil(int extraBatery) {
//         super();
//         this.extraBatery = extraBatery;
//         this.extraCharger = EXTRA_CHARGER;
//     }

    
//     /**
//      * Constructor de la clase ComputadorPortatil que usa tres parametros
//      *
//      * @param extraBatery
//      * @param extraCharger
//      */
//     public ComputadorPortatil(int extraCharger, int extraBatery) {
//         super();
//         this.extraCharger=extraCharger;
//         this.extraBatery=extraBatery;
//     }

//     /**
//      * Metodo sobrecargado desde la clase padre (Computador)
//      * <p>
//      *
//      * @return super.calcularPrecio() + extraBatery + extraCharger;
//      */
//     @Override

//     public double calcularPrecio() {
//         double precioTotal = 0.0;
//         precioTotal =  super.calcularPrecio()+this.extraBatery+this.extraCharger;
//         return precioTotal;
//     }
// }





}
