public class FahrenheitConverter implements Converter {
    @Override
    public void convert(double temp){
        System.out.println(temp + " Fahrenheit is:");
        System.out.println((temp-32)/1.8 + " Celsius" + "\n" + ((temp-32)/1.8 + 273.15) + " Kelvin" + "\n");
    }
}
//Fah - 1.8 * temp + 32
//Kel - temp + 273.15
