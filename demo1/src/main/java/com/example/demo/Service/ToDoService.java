package com.example.demo.Service;

import com.example.demo.Dto.ToDoDto;
import com.example.demo.Entity.ToDo;

import java.util.List;

public interface ToDoService {
    List<ToDo> getToDO();
    void addToDO(ToDoDto studentDto);
    boolean deleteToDO(Long Id);


}
