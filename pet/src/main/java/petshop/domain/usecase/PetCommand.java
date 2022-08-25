package petshop.domain.usecase;

import petshop.PetApplication;
import petshop.domain.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PetCommand{
    @Autowired
    PetRepository petRepository;

    public void feed(){
    }
    public void unregister(){
        UnRegistered unRegistered = new UnRegistered();
        /*
        Input Event Content
        */
        unRegistered.publishAfterCommit();

    }
    public void test(){
    }
    public void test2zzzz(){
    }
    public void test333(){
    }
    public void test444(){
    }
}