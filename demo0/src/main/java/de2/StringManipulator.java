package de2;

public class StringManipulator {
    public String concatenate(String str1, String str2){
        if(str1==null||str2==null){
            throw new IllegalArgumentException("null");
        }
        return str1+str2;
    }
}
