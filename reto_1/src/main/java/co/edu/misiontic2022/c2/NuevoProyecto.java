package co.edu.misiontic2022.c2;

public class NuevoProyecto {

    //Atributos 
    private int periodo;
    private double monto;
    private double interes;
    


    //Constructores
    NuevoProyecto(){
        periodo = 0;
        monto = 0;
        interes = 0;
    }

    NuevoProyecto( int pPeriodo, double pMonto, double pInteres){
        periodo = pPeriodo;
        monto = pMonto;
        interes = pInteres;
    }


    //Métodos
    public double calcularInteresSimple(){
        double interesSimple;

        interesSimple = monto * (interes / 100) * periodo;

        return Math.round(interesSimple);
    }


    public double calcularInteresCompuesto(){
        double interesCompuesto;

        interesCompuesto = monto * ((Math.pow((1+(interes/100)), periodo)) - 1);

        return Math.round(interesCompuesto);
    }


    public double compararInversion ( int pPeriodo, double pMonto, double pInteres){
        double diferencia;

        periodo = pPeriodo;
        monto = pMonto;
        interes = pInteres;

        diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        return diferencia;
    }


    public double compararInversion (){
        double diferencia;
        periodo = 0;
        monto = 0;
        interes = 0;

        diferencia = calcularInteresCompuesto() - calcularInteresSimple();

        return diferencia;
    }


    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto();
        System.out.println();
        System.out.println(np.calcularInteresSimple());
        System.out.println(np.calcularInteresCompuesto());
        System.out.println(np.compararInversion(6, 10000000, 1.2));


        
        NuevoProyecto np1 = new NuevoProyecto(6, 10000000, 1.2);
        System.out.println();
        System.out.println(np1.calcularInteresSimple());
        System.out.println(np1.calcularInteresCompuesto());
        System.out.println(np1.compararInversion(6, 10000000, 1.2));
    }

}
