module es.etg.daw.prog.mercadaw {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens es.etg.daw.prog.mercadaw to javafx.fxml;
    exports es.etg.daw.prog.mercadaw;
}
