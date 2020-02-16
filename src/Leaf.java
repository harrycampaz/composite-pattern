public class Leaf implements Component {
    private static final String TAG = "Leaf";

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void inflate() {

        System.out.println(TAG +" inflate: "+ getName());
    }
}
