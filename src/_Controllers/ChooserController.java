package _Controllers;

import java.io.File;

import FileChooserView.FileChooserView;

public class ChooserController {
    public String getOpenPath(FileChooserView fileChooserView)
    {
        File file=fileChooserView.openFile();
        if(file!=null) {
            String path = file.getPath();
            path = path.replaceAll("\\\\", "\\\\\\\\");


            return path;
        }
        else return null;
    }
    public String getSavePath(FileChooserView fileChooserView)
    {
        File file=fileChooserView.saveFile();
        if (file!=null) {
            String path = file.getPath();
            path = path.replaceAll("\\\\", "\\\\\\\\");
            if (!(path.endsWith(".xml"))&&!(path.endsWith(".json")))
            {
                path=path.split("\\.")[0]+".xml";
            }


            return path;
        }
        else return null;
    }
}
