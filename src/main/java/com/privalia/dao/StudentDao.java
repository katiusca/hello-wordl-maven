package com.privalia.dao;

import com.privalia.model.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StudentDao implements IDao<Student> {
    static Properties properties = null;
    static FileInputStream inputStream = null;
    static {
        properties = new Properties();
        try {
            inputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Override
    public Student add(Student model) throws IOException {
        return null;
    }
}
