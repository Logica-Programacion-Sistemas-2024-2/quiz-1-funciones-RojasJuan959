
package quiz1sistemas;

public class App {
    public static void main(String[] args) {
        
        // Logica de solucion
        
    }

    /*  Implemente una funcion llamada calcularValorBoleta que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero que representa la cantidad de boletas compradas
        * Retorna:
            - Un entero representando el valor total de las boletas
    */
    //------------------------------------------------------------------
    public static int calcularValorBoleta(String tipoBoleta, int cantidadBoletas){
        try {
            if (cantidadBoletas > 0){
                switch (tipoBoleta) {
                    case "V":
                        return 15000 * cantidadBoletas;
                    case "G":
                        return 10000 * cantidadBoletas;
                    default:
                        return -1;
                }
            } 
            else{
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorNetoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el numero de combo selecciondo
            - Un entero representando la cantidad de combos comprados
        * Retorna:
            - Un entero representando el valor neto del combo
    */
    //------------------------------------------------------------------
    public static int calcularValorNetoCombo(int tipoCombo, int cantidadCombo){
        try {
            if (cantidadCombo > 0){
                switch (tipoCombo) {
                    case 1:
                        return 40000 * cantidadCombo;
                    case 2:
                        return 30000 * cantidadCombo;
                    case 3:
                        return 42000 * cantidadCombo;                
                    default:
                        return -1;
                }
            }
            else{
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularDescuentoCombo que cumpla con las siguientes caracteristicas
        * Recibe:
            - Una cadena de caracteres que representa el tipo de silla comprada (V ó G)
            - Un entero representando el valor neto del combo
        * Retorna:
            - Un entero representando el valor del descuento
    */
    //------------------------------------------------------------------
    public static int calcularDescuentoCombo(String tipoBoleta, int tipoCombo, int valorNetoCombo){
        try {
            if (valorNetoCombo > 0){
                switch (tipoBoleta) {
                    case "V":
                        if (tipoCombo == 1){
                            return (int)(valorNetoCombo * 0.05);
                        }
                        else if(tipoCombo == 2){
                            return (int)(valorNetoCombo * 0.06);
                        }
                        else if(tipoCombo == 3){
                            return (int)(valorNetoCombo * 0.03);
                        }
                        else{
                            return -1;
                        }
                    case "G":
                        return 0;
                    default:
                        return -1;
                }
            }
            else{
                return -1;
            }
            
        } catch (Exception e) {
            return -1;
        }
    }


    //------------------------------------------------------------------

    /*  Implemente una funcion llamada calcularValorFactura que cumpla con las siguientes caracteristicas
        * Recibe:
            - Un entero representando el valor neto del combo
            - Un entero representando el valor de las boletas
            - Un entero representando el valor del descuento del combo
        * Retorna:
            - Un entero representando el valor total de la factura
    */
    //------------------------------------------------------------------
    public static int calcularValorFactura(int valorNetoCombo, int valorBoletas, int valorDescuentoCombo){
        try {
            return valorNetoCombo + valorBoletas + valorDescuentoCombo;
        } catch (Exception e) {
            return -1;
        }
    }


    //------------------------------------------------------------------
}
