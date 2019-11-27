package com.test.designPattern.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    
    public static void main(String[] args) {

        List<File> manyBytefiles= new ArrayList<>();
        List<File> manyImagefiles= new ArrayList<>();
        
        FileFormatContextStretegyDecider fsd= new FileFormatContextStretegyDecider();
        
        //byte should be compress using zip file formatter
        fsd.setFileFormatStregy(new ZipCompressFileFormat());
        fsd.compressfile(manyBytefiles);
        
        //Image should be compress using Rar file formatter
        fsd.setFileFormatStregy(new RarCompressFileFormat());
        fsd.compressfile(manyImagefiles);
    }

}
