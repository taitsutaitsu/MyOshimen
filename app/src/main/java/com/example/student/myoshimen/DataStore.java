package com.example.student.myoshimen;

import java.util.ArrayList;

public class DataStore {
    private int OshiCount=1;
    ArrayList<Integer> age = new ArrayList<Integer>();
    ArrayList<String> group = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
    DataStore(){

    }

    String OshiRegist(int catchAge,String catchGroup,String catchName){
        age.add(catchAge);
        group.add(catchGroup);
        name.add(catchName);
        String end="成功です";
        return end;
    }
}
