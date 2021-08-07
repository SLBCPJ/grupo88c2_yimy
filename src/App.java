import model.Computador;
import model.ComputadorMesa;
import model.ComputadorPortatil;
import model.PrecioTotal;

public class App {
    public static void main(String[] args) throws Exception {
        Computador pcs2[] = new Computador[1];
        pcs2[0] = new ComputadorPortatil();
        PrecioTotal precioT2 = new PrecioTotal(pcs2);
        precioT2.mostrarTotales();

        Computador pcs3[] = new Computador[2];
        pcs3[0] = new ComputadorPortatil();
        pcs3[1] = new ComputadorMesa();
        PrecioTotal precioT3 = new PrecioTotal(pcs3);
        precioT3.mostrarTotales();

        Computador pcs4[] = new Computador[4];
        pcs4[0] = new ComputadorPortatil(130000);
        pcs4[1] = new ComputadorMesa(55000);
        pcs4[2] = new ComputadorPortatil(106000, 65000);
        pcs4[3] = new ComputadorMesa(68000, 180000);
        PrecioTotal precioT4 = new PrecioTotal(pcs4);
        precioT4.mostrarTotales();
    }
}
