package abstractElement;

import java.util.ArrayList;
import java.util.List;

public class ElementArray {

    public static void main(String[] args) {
        List<Element> elementArray = new ArrayList<>();
        // metal element
        MetalElement metalElement1 = new MetalElement("Ni", 28, 58.6934);
        elementArray.add(metalElement1);
        MetalElement metalElement2 = new MetalElement("Ti", 22, 47.867);
        elementArray.add(metalElement2);
        // non metal element
        NonMetalElement nonMetalElement1 = new NonMetalElement("N", 7, 14.0067);
        elementArray.add(nonMetalElement1);

        NonMetalElement nonMetalElement2 = new NonMetalElement("O", 8, 15.9994);
        elementArray.add(nonMetalElement1);


        for (Element element : elementArray
        ) {
            System.out.println( element.toString());
        }

    }

}
