public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 57;
        double height = 156;
        double bodyMassIndex = service.calculate(weight, height);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Рост: " + height + " см");
        System.out.println("Индекс Массы Тела: " + bodyMassIndex + " кг/м");
    }
}