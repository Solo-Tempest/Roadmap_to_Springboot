package Phase_1.week_1.part_3.Problem_4;

import java.util.HashMap;
import java.util.Map;

public class Problem_4 {
    public static void main(String[] args) {
        UserReposirtory repo = new InMemoryUserRepository();
        UserService service = new UserService(repo);
        service.saveUser(new User(1 , "Aditya"));
        service.saveUser(new User(2 , "Saksham"));

        System.out.println(service.findUserById(1));
        service.deleteUser(1);
        System.out.println(service.findUserById(1));
    }
}

class User{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "User{id=" + id + ", name='" + name + "'}";
    }
}

interface UserReposirtory{
    User findById(int id);
    void save(User user);
    void delete(int id);
}

class InMemoryUserRepository implements UserReposirtory{
    private Map<Integer , User> storage = new HashMap<>();

    @Override
    public User findById(int id){
        return storage.get(id);
    }

    @Override
    public void save(User user) {
       storage.put(user.getId(), user);
    }

    @Override
    public void delete(int id) {
        storage.remove(id);
    }

}

class UserService{
    private UserReposirtory repository;

    public UserService(UserReposirtory repository){
        this.repository = repository;
    }

    public void saveUser(User user){
        repository.save(user);
    }

    public User findUserById(int id) {
        return repository.findById(id);
    }

    public void deleteUser(int id) {
        repository.delete(id);
    }

}