package com.test.designPattern.strategy;

import java.io.File;
import java.util.List;

/*
 * strategy design pattern is part of behavioural  pattern, this pattern with help us to identify 
 * the manage algorithms, relationships and responsibilities between objects. 
 * The definition of Strategy provided in the original Gang of Four book on 
 * DesignPatterns states.
 * A good use of the Strategy pattern would be saving files in different formats,
 *  running various sorting algorithms, or file compression. 
 * */
public interface CompressfileFormat {
    public void compress(List<File> files);
}
