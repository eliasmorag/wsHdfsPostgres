package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Airplane;
import com.example.postgresdemo.repository.AirplaneRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


import java.io.*;
import java.net.URI;
import java.util.List;

@RestController
public class AirplaneController {

    @Autowired
    private AirplaneRepository airplaneRepository;

    public AirplaneController() throws IOException {
    }

    @PostMapping("/airplanes")
    public List<Airplane> createAirplane(@Valid @RequestBody List<Airplane> airplane) throws IOException {


        String uri = "hdfs://localhost:9000/user/eliasmorag/test.json";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri), conf);

        ObjectMapper mapper = new ObjectMapper();

        OutputStream os;
        Path hdfsPath = new Path(uri);

        if (!fs.exists(hdfsPath)){
            System.out.println("No existe");
            os = fs.create(hdfsPath);
        }else{
            System.out.println("Existe");
            os =fs.append(hdfsPath);
        }

        BufferedWriter br = new BufferedWriter( new OutputStreamWriter( os, "UTF-8" ) );

        try {
            br.write(mapper.writeValueAsString(airplane) +"\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        br.close();



        return airplaneRepository.saveAll(airplane);
    }

}