package ConcurrencyQuestion;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private final String name;
    private final Set<String> permissions;

    public Employee(String name){
        this.name = name;
        this.permissions = new HashSet<>();
    }

    public String getName(){
        return this.name;
    }
    public void addPermission(String permission){
        this.permissions.add(permission);
    }
    public boolean hasPermission(String permission){
        return this.permissions.contains(permission);
    }

}
