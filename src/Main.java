public class Main {
    public static void main(String[] args) {

//        Component newLeaf = new Leaf("New Leaf");
//        Component oldLeaf = new Leaf("Old Leaf");
//
//        Component composite = new Composite("New Composite");
//        composite.add(newLeaf);
//        composite.add(oldLeaf);
//
//        Component composite2 = new Composite("Another composite");
//
//        composite2.add(oldLeaf);
//        composite2.add(composite);
//
//        composite2.add(new Leaf("Recent added leaf"));
//
//        composite2.inflate();


        Builder builder = new Builder();

        builder.imageView.inflate();

        builder.layout1().inflate();
        builder.layout2().inflate();
        builder.layout3().inflate();

    }
}
