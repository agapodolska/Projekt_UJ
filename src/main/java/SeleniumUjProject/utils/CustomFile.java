package SeleniumUjProject.utils;

import java.io.File;
import java.nio.file.Paths;

public class CustomFile {

    public  String getDriverFilePath(String driverFileName){
        return getResourceFilePath(driverFileName) ;// katalog ("drivers/" + driverFileName

    }

    public String getResourceFilePath(String fileName){
        try{
            return Paths.get(new File(getClass().getClassLoader().getResource(fileName).getFile()).getAbsolutePath()).toString();
        } catch (Exception e){
            return "";
        }


    }
}
