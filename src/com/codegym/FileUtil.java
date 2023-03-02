package com.codegym;

import java.io.File;

public class FileUtil {
    public long calculateSize(File file) {
        long size = 0;
        if (file.isFile()){
            size = file.length();
        } else {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    size += calculateSize(f);
                }
            }
        }
        return size;
    }
}
