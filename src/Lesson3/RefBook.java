package Lesson3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RefBook {
    private Map<String, Set<String>> phoneList = new HashMap<>();

    public void addPhone(String name, String phone){
        Set<String> ph = phoneList.getOrDefault(name, new HashSet<>());
        ph.add(phone);
        phoneList.put(name, ph);
    }
    public Set<String> getPhones(String name){
        return phoneList.get(name);
    }
}
