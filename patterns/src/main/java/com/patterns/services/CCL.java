package com.patterns.services;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CCL extends ClassLoader {

    @SneakyThrows
    @Override
    public Class<?> findClass(String className) throws ClassNotFoundException {
        String fileName = "target/classes/" + className.replace('.', File.separatorChar) + ".class";
        byte[] byteCode = Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(className, byteCode, 0, byteCode.length);
    }
}
