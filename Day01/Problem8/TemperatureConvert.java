public class TemperatureConvert {

    public static void main(String[] args) {
        double celsius = 37.0;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Result as double: " + fahrenheit);
        System.out.println("Integer part truncated: " + (int) fahrenheit);
        System.out.println("Rounded integer part: " + Math.round(fahrenheit));
    }
}
