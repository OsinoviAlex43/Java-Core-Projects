public class KelvinConverter implements Converter{

    @Override
    public void convert(double temp) {
        System.out.println(temp + " Kelvin is:");
        System.out.println(temp-273.15 + " Celsius" + "\n" + ((temp-273.15)*1.8+32) + " Fahrenheit" + "\n");
    }
}
//Fah - 1.8 * temp + 32
//Kel - temp + 273.15
