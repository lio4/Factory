package com.HelloWorld.Factory;

import com.google.common.io.Resources;

import java.io.IOException;

public class Build {

    public void generate() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("java", "-jar", Resources.getResource("HelloOne.jar").getPath());
        Process p = pb.start();
        }
}
