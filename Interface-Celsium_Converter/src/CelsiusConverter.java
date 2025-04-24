public class CelsiusConverter implements Converter{
    @Override
    public void convert(double temp) {
        System.out.println(temp + " Celsius is:");
        System.out.println(1.8 * temp + 32 + " Fahrenheit" + "\n" + (temp + 273.15) + " Kelvin" + "\n");
    }
}
//Fah - 1.8 * temp + 32
//Kel - temp + 273.15

