

public class Main {
    public static void main(String[] args) {
      FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
      KelvinConverter kelvinConverter = new KelvinConverter();
      CelsiusConverter celsiusConverter = new CelsiusConverter();
      celsiusConverter.convert(50);
      kelvinConverter.convert(30);
      fahrenheitConverter.convert(90);

    }
}