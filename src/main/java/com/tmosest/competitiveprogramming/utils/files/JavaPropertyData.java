package com.tmosest.competitiveprogramming.utils.files;

import lombok.Builder;
import lombok.Getter;

@Builder
public class JavaPropertyData {
    @Getter private String accessor;
    @Getter private String type;
    @Getter private String name;
    @Getter private String value;
}
