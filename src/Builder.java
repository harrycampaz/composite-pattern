public class Builder {

    Component imageView = new Leaf("Imagen view");
    Component textView = new Leaf("Text view");
    Component buttonView = new Leaf("Button view");

    Component layout1(){
        Component c = new Composite("Layout1");

        c.add(imageView);
        c.add(textView);

        return c;
    }

    Component layout2(){
        Component c = new Composite("Layout2");

        c.add(buttonView);
        c.add(layout1());

        return c;
    }

    Component layout3(){
        Component c = new Composite("Layout3");

        c.add(layout1());
        c.add(layout2());

        return c;
    }
}
