package com.example.demo.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.app.task.TaskForm;
import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class indexController {

	private final TaskService taskService;

    @GetMapping
    public String index(TaskForm taskForm, Model model){
        List<Task> list = taskService.findAll();

        model.addAttribute("list", list);
        model.addAttribute("title", "タスク一覧");

        return "index";
    }
}
