package com.example;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

import java.util.List;
import java.util.Map;

@StaticInitSafe
@ConfigMapping(prefix = "example.config")
public interface MyConfig {

    String foo();

    Map<String, String> map();

    List<String> list();

    NestedConfig nested();

    interface NestedConfig {

        String nestedName();

    }

}
