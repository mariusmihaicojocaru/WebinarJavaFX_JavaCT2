package ro.sda.WebinarJavaFx_JavaCT2;

import javafx.scene.input.MouseEvent;

public class MainController {
    public void onButtonAction(){
        System.out.println ("ai apasat prea tare");
    }

    public void onMouseClicked (MouseEvent mouseEvent) {
        System.out.println ("Aprins");
    }

    public void onMouseEntered (MouseEvent mouseEvent) {
        System.out.println ("bine ai venit");
    }

    public void onMouseExit (MouseEvent mouseEvent) {
        System.out.println ("pa");
    }
}
