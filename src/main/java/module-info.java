module at.htlle.pos.todomanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens at.htlle.pos.todomanager to javafx.fxml;
    exports at.htlle.pos.todomanager;
    exports at.htlle.pos.todomanager.controller;
    opens at.htlle.pos.todomanager.controller to javafx.fxml;
}