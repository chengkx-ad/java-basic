package test2;

public class GoodTest {
    public static void main(String[] args) {
        Good[] arr = new Good[3];

        Good g1 = new Good("001", "华为p60", 5000.0, 100);
        Good g2 = new Good("002", "保温杯", 100.0, 200);
        Good g3 = new Good("003", "枸杞", 50.0, 50);

        // 把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Good good = arr[i];
            System.out.println(good.getId() + "," + good.getName() + "," + good.getPrice() + "," + good.getCount());
        }

    }
}
