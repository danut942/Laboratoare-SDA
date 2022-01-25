package ro.usv;

import java.security.PrivateKey;
import java.util.ArraysList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String phone;

    public Student(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result =1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

    }
}
