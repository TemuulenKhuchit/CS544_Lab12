package edu.miu.cs544.temuulen.lab12.controller;

import edu.miu.cs544.temuulen.lab12.service.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
    @Autowired
    Publisher publisher;

}
