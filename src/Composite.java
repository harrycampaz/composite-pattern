import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private static final String TAG = "Composite";
    private String name;
    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

        components.add(c);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {

        System.out.println(TAG + "Inflate: "+ getName());

        for (Component i: components){

            i.inflate();
        }
    }
}
