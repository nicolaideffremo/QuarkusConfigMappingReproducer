package com.example;

import io.quarkus.runtime.annotations.StaticInitSafe;
import io.smallrye.config.ConfigMapping;

@StaticInitSafe
@ConfigMapping(prefix = "example")
public interface MyOtherConfig {

    String foo();

    MyConfig config();
}
