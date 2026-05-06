import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String operador;
        char tipoCombustible;
        double galones;
        double precioPorGalon;
        double subtotal;
        double iva;
        double total;
        double promedioCosto;
        final double PORCENTAJE_IVA = 0.19;
        System.out.print("Nombre del operador: ");
        operador = lector.nextLine();
        System.out.print("Inicial del tipo de combustible (C/E/A): ");
        tipoCombustible = lector.next().charAt(0);
        System.out.print("Cantidad de galones tanqueados: ");
        galones = lector.nextDouble();
        System.out.print("Precio por galón (COP): ");
        precioPorGalon = lector.nextDouble();
        subtotal = galones * precioPorGalon;
        iva = subtotal * PORCENTAJE_IVA;
        total = subtotal + iva;
        promedioCosto = total / galones;
        System.out.print("\n========== RECIBO DE TANQUEO - EDS AGROCASANARE ==========\n");
        System.out.print("Operador: " + operador + "\n");
        System.out.print("Tipo de combustible: " + tipoCombustible + "\n");
        System.out.print("Galones tanqueados: " + galones + "\n");
        System.out.print("Precio por galón: $" + precioPorGalon + "\n");
        System.out.print("------------------------------------------------------------\n");
        System.out.print("Subtotal (sin IVA): $" + subtotal + "\n");
        System.out.print("IVA (19%): $" + iva + "\n");
        System.out.print("------------------------------------------------------------\n");
        System.out.print("TOTAL A PAGAR: $" + total + "\n");
        System.out.print("Promedio de costo por galón: $" + promedioCosto + "\n");
        System.out.print("============================================================\n");
        lector.close();
    }
}
