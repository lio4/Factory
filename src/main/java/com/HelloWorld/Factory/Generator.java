package com.HelloWorld.Factory;

import com.google.common.io.Resources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
@RestController
@RequestMapping(path = "/Factory")
public class Generator {

    @GetMapping (path = "/generate")
    public void bla() throws IOException {
        Build g = new Build();
    }

}
