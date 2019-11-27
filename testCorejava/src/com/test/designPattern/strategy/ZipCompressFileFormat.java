package com.test.designPattern.strategy;

import java.io.File;
import java.util.List;

public class ZipCompressFileFormat implements CompressfileFormat {

    @Override
    public void compress(List<File> files) {
        System.out.println("zip file format algo applied");
    }
}
