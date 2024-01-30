package com.example.demo.Service.impl;

import com.example.demo.Dto.ToDoDto;
import com.example.demo.Entity.ToDo;
import com.example.demo.Repository.ToDoRepository;
import com.example.demo.Service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {
    ModelMapper modelMapper;

    final ToDoRepository toDoRepository;
    @Override
    public List<ToDo> getToDO() {
        return toDoRepository.findAll();
    }

    @Bean
    public void setUp(){
        this.modelMapper=new ModelMapper();
    }
    @Override
    public void addToDO(ToDoDto studentDto) {
        ToDo mapped = modelMapper.map(studentDto, ToDo.class);
        toDoRepository.save(mapped);

    }

    @Override
    public boolean deleteToDO(Long id) {
        if (toDoRepository.existsById(id)){
            toDoRepository.deleteById(id);
            return true;
        }
        return  false;

    }
}
