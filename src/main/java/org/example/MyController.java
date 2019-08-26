package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MyController {

    @Autowired
    private MyDataRepository myDataRepository;

    @GetMapping("/")
    List<MyData> index(){
        return myDataRepository.findAll();
    }

    @PutMapping("/")
    void add(@RequestBody MyData myData){
        myDataRepository.insert(myData);
    }
}
