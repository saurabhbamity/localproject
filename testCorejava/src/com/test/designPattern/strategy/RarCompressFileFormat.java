package com.test.designPattern.strategy;

import java.io.File;
import java.util.List;

public class RarCompressFileFormat implements CompressfileFormat {

    @Override
    public void compress(List<File> files) {
        System.out.println("rar file format also format style");
    }

}
