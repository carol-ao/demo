package com.forum.demo.controller;

import com.forum.demo.domain.Curso;
import com.forum.demo.domain.Topico;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping(value = "/topicos")
    public List<TopicoDto> getTopicos(){
        Topico topico = new Topico("Teste", "tópico teste", new Curso("ADS", "Exatas") );
        return TopicoDto.toDtoList(Arrays.asList(topico, topico, topico));
    }

}
