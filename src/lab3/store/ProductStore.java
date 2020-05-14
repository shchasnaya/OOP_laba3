package lab3.store;
import lab3.model.AbstractForm;
import lab3.model.IWeight;
import lab3.model.Timber;
import java.util.Arrays;

public class ProductStore {
    private IWeight[] arr = new IWeight[3];
    private int count = 0;

    //повертає копію масиву без пустих елементів
    public IWeight[] getArr() {
        return Arrays.copyOf(arr,count);
    }

    public void add(IWeight newProduct) {
        //запобігаємо переповненню масиву
        if(arr.length == count)
            arr = Arrays.copyOf(arr, count + count/2);
        //додаємоновий елемент
        arr[count++] = newProduct;

    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Каталог брусів:\n");
        for(int i = 0; i < count; i++) {
            sb.append(arr[i]).append("\n");
        }
        return sb.toString();
    }
}


