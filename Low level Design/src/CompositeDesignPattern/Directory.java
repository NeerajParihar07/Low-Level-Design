package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String name){
        this.directoryName = name;
        fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fs){fileSystemList.add(fs);}

    @Override
    public void ls() {
        System.out.println("Directory name " + directoryName);

        for(FileSystem fs : fileSystemList){
            fs.ls(); // main use of composite pattern
        }
    }
}
