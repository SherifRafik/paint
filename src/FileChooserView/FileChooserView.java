package FileChooserView;

import java.io.File;

import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FileChooserView {
    private FileChooser fileChooser;
    private Stage window;
    private File file;

    public FileChooserView() {
        fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter=new FileChooser.ExtensionFilter("XML AND JSON FILES","*.xml","*.json");
        fileChooser.selectedExtensionFilterProperty();
        fileChooser.getExtensionFilters().add(filter);
        window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
    }

    public File openFile() {
        file = fileChooser.showOpenDialog(window);
       return this.file;
    }

    public File saveFile()
    {
        file = fileChooser.showSaveDialog(window);
        return this.file;
    }
}
