package com.example.demo.service;

import com.example.demo.entity.ThucVat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ThucVatService {
    public List<ThucVat> list=new ArrayList<>();

    public ThucVatService() {
        list.add(new ThucVat(1, "cay gi", "chuoi", 2, true, "1"));
        list.add(new ThucVat(2, "go", "abc", 2, false, "2"));
        list.add(new ThucVat(3, "an qua", "xyz", 2, true, "1"));
    }

    public List<ThucVat> getAll(){
        return list;
    }

    public void add(ThucVat tv){
    list.add(tv);
    }
    public void delete(Integer id){
        for (int i = 0;i  <list.size() ; i++) {
            if (list.get(i).getId().equals(id)){
                list.remove(i);
                break;
            }
        }
    }

    public ThucVat detail(Integer id){
        for (ThucVat tv: list) {
            if(tv.getId().equals(id)){
                return tv;
            }
        }
        return null;
    }

    public void update(ThucVat t){
        for (int i = 0; i < list.size(); i++) {
            ThucVat tv=list.get(i);
            if(tv.getId().equals(t.getId())){
                list.set(i,t);
                break;
            }
        }
    }


    public List<ThucVat> search(String ten){
        return list.stream()
                .filter(thucVat ->thucVat.getTen().toLowerCase().contains(ten.toLowerCase()))
                .collect(Collectors.toList());
    }

}
