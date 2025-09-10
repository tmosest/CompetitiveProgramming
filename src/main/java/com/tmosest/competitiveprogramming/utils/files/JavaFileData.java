package com.tmosest.competitiveprogramming.utils.files;

import java.util.List;

import com.tmosest.competitiveprogramming.utils.string.ClassNameUtil;

import lombok.Builder;
import lombok.Getter;

@Builder
public class JavaFileData {
    // class name and name of the file.
    @Getter private String name;
    // File level comment.
    @Getter private String comment;
    // List of properties for the class.
    @Getter private List<JavaPropertyData> properties;
    // List of all the functions in the class.
    @Getter private List<JavaMethodData> functions;

    public String getFileName() {
        return ClassNameUtil.instance().convertToClassName(name);
    }
}
