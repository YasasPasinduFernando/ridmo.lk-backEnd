package com.example.demo.Controller;

import com.example.demo.Dto.ToDoDto;
import com.example.demo.Entity.ToDo;
import com.example.demo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Home")
@CrossOrigin
public class TodoController {
    @Autowired
    ToDoService toDoService;
    @PostMapping("/add")
    public void addStudent(@RequestBody ToDoDto studentDto){
        toDoService.addToDO(studentDto);
    }
    @GetMapping("/get")
    public List<ToDo> getToDO(){
        return toDoService.getToDO();
    }
    @DeleteMapping("/{id}")
    public void deleteToDo(@PathVariable Long id){
        toDoService.deleteToDO(id);
    }
}
