import java.util.ArrayList;
import java.util.List;

public class Test {
    int name;
    String address;

    public Test(int name, String address) {
        this.name = name;
        this.address = address;
    }


    public static void main(String[] args) {
        Test t = new Test(12, "Anand");
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l);
    }
}

