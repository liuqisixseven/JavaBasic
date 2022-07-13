package JavaTest.extends_.bqy;

public class ExtendsDemo {
    public static void main(String[] args) {
        BuQingyan buQingyan = new BuQingyan();
        buQingyan.setRice("米饭");
        buQingyan.setVegetables("蔬菜");
        buQingyan.setMeat("肉");
        buQingyan.setWc("吃饱了上厕所");
        System.out.println("吃" + buQingyan.getRice() + "吃" + buQingyan.getVegetables()
                + "吃" + buQingyan.getMeat() + "厕所什么时候去" + buQingyan.getWc());
    }
}
