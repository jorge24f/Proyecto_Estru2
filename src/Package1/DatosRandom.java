package Package1;
import java.util.Random;


public class DatosRandom {
    private Random rand = new Random();
    //Para los strings aleatorios, arrays para escoger letras
    protected String[] primera = {"aasdr","bsghd","cfdjt","dasda","ebed","fxcve","gnhud","haweg","istyy","jyuig","kzfdx","lcvnn","msydr"};
    protected String[] segunda = {"aasr","bsghd","cfjt","dasda","ebrd","fxcve","gnhd","haweg","ityy","jyuig","kzfdx","lcvnn","msydr"};
    protected String[] tercera = {"aadr","bsghd","cfdjt","dasd","ebred","fxcve","gnhud","haweg","isyy","yuig","kfdx","lcvnn","msydr"};
    protected String[] cuarta = {"aasd","bshd","cfdjt","asda","ebed","fxcve","ghud","aweg","istyy","jyuig","kzfdx","lcvnn","mydr"};

    public DatosRandom() {
    }
    
    //agarrar letras aleatorias para crear nombres aleatorios
    public String nombreRand(){
        String principio = primera[rand.nextInt(primera.length)];
        String medio1 = segunda[rand.nextInt(segunda.length)];
        String medio2 = tercera[rand.nextInt(tercera.length)];
        String end = cuarta[rand.nextInt(cuarta.length)];
        return principio + medio1 + medio2 + end;
    }
     
    //numero aleatorio entre 1-100 para la edad
    public int edadRand(){
        int edad = rand.nextInt(100) + 1; 
        return edad;
    }
    
    //numero aleatorio entre 1-99 para la ciudad
    public int cityidRand(){
        int city = rand.nextInt(99) + 1; 
        return city;
    }
   
}