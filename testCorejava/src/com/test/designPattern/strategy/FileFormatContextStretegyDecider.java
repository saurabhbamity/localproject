package com.test.designPattern.strategy;

import java.io.File;
import java.util.List;

public class FileFormatContextStretegyDecider {
    
    private CompressfileFormat CompressfileFormatType; 
    
    //user will call this method and will pass the type of file format he reqiored to compress the file,
    //which set the tyle of stretegy to apply to format file. 
    public void setFileFormatStregy(CompressfileFormat CompressfileFormatType) {
        this.CompressfileFormatType= CompressfileFormatType;
    }
    
    public void compressfile(List<File> files){
        CompressfileFormatType.compress(files);
    }

}
