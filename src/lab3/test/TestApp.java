package lab3.test;
import lab3.model.*;
import lab3.store.ProductStore;
import lab3.store.WoodDirectory;

public class TestApp {
    private WoodDirectory wd = new WoodDirectory();
    private ProductStore ps = new ProductStore();
    public static void main (String[] args){
        TestApp app = new TestApp();
        app.startApp();
    }

    private void startApp(){
        //Наповнюємо сховище брусів
        ps.add(new Timber(wd.get(0), 5f, 0.5f, 0.4f));
        ps.add(new Timber(wd.get(1), 10f, 0.5f, 0.4f));
        ps.add(new Cilinder(wd.get(2), 5f, 0.4f));
        ps.add(new Waste(20f));
        ps.add(new Timber_triangle(wd.get(0),3f,8f));
        //додаємо перелік продуктів
        System.out.println(wd);
        System.out.println(ps);
        //Обчислюємо вагу продуктів
        System.out.printf("Загальна вага: %1.3f", calcWeight());
    }

    private float calcWeight(){
        float fullWeight = 0;
        for(IWeight weight : ps.getArr()){
            fullWeight += weight.weight();
        }
        return fullWeight;
    }
}

