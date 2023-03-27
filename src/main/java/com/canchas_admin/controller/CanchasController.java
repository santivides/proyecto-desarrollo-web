package com.canchas_admin.controller;

import com.canchas_admin.model.Canchas;
import com.canchas_admin.model.CanchasRepository;

import antlr.collections.List;

import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CanchasController {

    @Autowired
    private CanchasRepository canchaService;

    @CrossOrigin
    @GetMapping(value =  "/Canchas", produces ={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> getCanchas() throws Exception{
        Iterable<Canchas>canchas = canchaService.findAll();
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<String>( Canchas.toJSONArray(canchas).toString(), responseHeaders, HttpStatus.OK );
	};

    @CrossOrigin
    @GetMapping(value = "/cancha/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public Canchas getcanchaById(@PathVariable Long id){
        return canchaService.getcanchaById(id);
    }

    @CrossOrigin
    @PostMapping(value = "/newcancha",produces = {MediaType.APPLICATION_JSON_VALUE})
    public void createcancha(@RequestBody cancha cancha) {
        canchaService.newcancha(cancha);
    }

    @CrossOrigin
    @PutMapping(value = "/updatecancha/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
    public void updatecancha(@PathVariable(value = "id") Long id, @RequestBody cancha herramienta) {
        canchaService.updatecancha(herramienta,id);}

    @CrossOrigin
    @DeleteMapping("/deletecancha/{id}")
    public void deletecancha(@PathVariable(value="id")Long id){
        canchaService.delete(id);
    }
    
}