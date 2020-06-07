import Engines.*;

public class Main {

    public static void main(String[] args) {
        engineArray();
        heatManagerArray();
    }
    public static void heatManagerArray(){
        HeatEngine firstHeatEngine = new HeatEngine(20,5,"Magenta");
        WrapperEngine firstWrapperEngine = new WrapperEngine(30,5,"Grey");

        HeatManager[] heatManagerArray = {firstHeatEngine,firstWrapperEngine};

        System.out.println();
        System.out.println("Heat specification: ");
        arrayRender(heatManagerArray);
    }
    public static void engineArray(){
        Engine engine = new Engine(500,5,"White");
        HeatEngine heatEngine = new HeatEngine(1000,5,"Black");
        WrapperEngine wrapperEngine = new WrapperEngine(10,5,"Blue");
        ProductionEngine productionEngine = new ProductionEngine(200,5,"Orange");

        Machine[] machineArray = {engine,heatEngine,wrapperEngine,productionEngine};

        System.out.println("Engine list:");
        arrayRender(machineArray);
    }
    public static void arrayRender(Machine[] array){
        for(int i =0;i<array.length;i++){
            System.out.println(array[i].getColor() + " engine "+array[i].getPower()+" power.");
        }
    }
    public static void arrayRender(HeatManager[] array){
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i].getPower();
        }
        System.out.println("Maximum operating temperature is "+sum);
    }
}
