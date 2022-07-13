package simpleFactory;

//简单工厂测试类
public class Client {
    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
