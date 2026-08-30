package HW_11.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CanBeClosed> entities = new ArrayList<>();
        entities.add(new MyBrowser());
        entities.add(new MyFile());
        SessionCloser closer = (list) -> {
            for (int i = 0; i < list.size(); i++) {
                list.get(i).close();
            }
        };
        closer.closeSession(entities);
    }
}
