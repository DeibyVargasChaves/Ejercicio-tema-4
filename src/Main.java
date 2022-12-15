

public class Main{

    public static void main(String[] args) {
        var numero = -2 ;
        var estacion = "PRIMAVERA";
        int contadorwhile = 0;
        int numeroFor = 0;



        if (numero> 0) {
            System.out.println("es positivo");
        } else if (numero < 0) {
            System.out.println("es negativo");
        }
        else {System.out.println("es 0");
        }


    while (contadorwhile < 3){
            System.out.println(contadorwhile);
            contadorwhile = contadorwhile + 1;
            }



    do {
        System.out.println(contadorwhile);
        contadorwhile = contadorwhile + 1;
        } while (contadorwhile < 3);



    for (; numeroFor <= 3; numeroFor = numeroFor + 1)
        System.out.println(numeroFor);



    switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            default:
                System.out.println(estacion);
        }
    }
}