package lab3.test;
import lab3.model.Wood;
import lab3.store.WoodDirectory;

public class TestWood {
    public static void main(String[] args) {
        // Створюємо каталог деревини
        WoodDirectory wd = new WoodDirectory();
        // Перевіряємо наявність елементу з id = 3
        System.out.println(wd.get(3)+"\n");
        // Створюємо новий вид деревини
        Wood w = new Wood (4, "Дуб", 1f);
        // Перевіряємо метод додавання
        if(wd.add(w))
            System.out.println(wd);
        // Спроба додати з існуючим id
        if(!wd.add(w))
            System.out.println(w + " вже існує\n");
    }

}


