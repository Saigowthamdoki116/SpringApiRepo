package com.example.SpringApi.service;
import com.example.SpringApi.api.model.User;
import com.example.SpringApi.entity.Entitis;
import com.example.SpringApi.repo.EntitiesRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final EntitiesRepo entitiesRepo;

    public UserService(EntitiesRepo entitiesRepo) {
        this.entitiesRepo = entitiesRepo;
    }


    //    private List<User> userList;
//    public UserService(){
//        userList = new ArrayList<>();
//        User user1=new User(1,"Ida",32,"ida@mail.com");
//        User user2=new User(2,"Hans",26,"hans@mail.com");
//        User user3=new User(3,"Lars",45,"lars@mail.com");
//        User user4=new User(4,"Ben",32,"bens@mail.com");
//        User user5=new User(5,"Eva",59,"eva@mail.com");
//        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
//
//    }
    public Entitis getUser(Integer id) {
        Optional<Entitis> entitis = entitiesRepo.findById(id);

//        Optional optional = Optional.empty();
//        for(User user : userList){
//            if(id == user.getId()){
//                optional= Optional.of(user);
//                return optional;
//            }
//        }
        return entitis.get();

    }


}
