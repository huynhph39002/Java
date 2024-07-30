package com.example.demo.service;

import com.example.demo.entity.DongVat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DongVatService {
    private List<DongVat> listt=new ArrayList<>();

    public DongVatService() {
        listt.add(new DongVat("dv01","voi",true,20.2,"ha noi"));
        listt.add(new DongVat("dv02","cho",true,23.2,"bac giang"));
        listt.add(new DongVat("dv03","ho",true,26.2,"ha noi"));
    }
    public List<DongVat> getAll(){
        return listt;
    }

    public void add(DongVat d){
        listt.add(d);
    }

    public void remove(String ma){
        for (int i = 0; i < listt.size(); i++) {
            if(listt.get(i).getMa().equalsIgnoreCase(ma)){
                listt.remove(i);
            }
        }
    }


    public List<DongVat> search(String ma){
        return listt.stream()
                .filter(dongVat -> dongVat.getMa().toLowerCase().contains(ma.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void update(){

    }
}
