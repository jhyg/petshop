package petshop.infra;
import petshop.domain.*;
import petshop.domain.usecase.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

 @RestController
 @RequestMapping(value="/pets")
 @Transactional
 public class PetController {

        @Autowired
        PetCommand petCommand;


        @RequestMapping(value = "/{id}/feed",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Item feed(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /item/feed  called #####");
                        Optional<Item> optionalItem = itemRepository.findById(id);
                        
                        optionalItem.orElseThrow(()-> new Exception("No Entity Found"));
                        Item item = optionalItem.get();
                        itemCommand.feed();
                        

                        return item;
                        
                }

        



        @RequestMapping(value = "/{id}/unregister",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Pet unregister(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /pet/unregister  called #####");
                        Optional<Pet> optionalPet = petRepository.findById(id);
                        
                        optionalPet.orElseThrow(()-> new Exception("No Entity Found"));
                        Pet pet = optionalPet.get();
                        petCommand.unregister();
                        

                        return pet;
                        
                }

        


        @RequestMapping(value = "/{id}/test",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Pet test(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /pet/test  called #####");
                        Optional<Pet> optionalPet = petRepository.findById(id);
                        
                        optionalPet.orElseThrow(()-> new Exception("No Entity Found"));
                        Pet pet = optionalPet.get();
                        petCommand.test();
                        

                        return pet;
                        
                }

        


        @RequestMapping(value = "/{id}/test2zzzz",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Pet test2zzzz(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /pet/test2zzzz  called #####");
                        Optional<Pet> optionalPet = petRepository.findById(id);
                        
                        optionalPet.orElseThrow(()-> new Exception("No Entity Found"));
                        Pet pet = optionalPet.get();
                        petCommand.test2zzzz();
                        

                        return pet;
                        
                }

        


        @RequestMapping(value = "/{id}/test333",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Pet test333(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /pet/test333  called #####");
                        Optional<Pet> optionalPet = petRepository.findById(id);
                        
                        optionalPet.orElseThrow(()-> new Exception("No Entity Found"));
                        Pet pet = optionalPet.get();
                        petCommand.test333();
                        

                        return pet;
                        
                }

        


        @RequestMapping(value = "/{id}/test444",
                method = RequestMethod.PUT,
                produces = "application/json;charset=UTF-8")
        public Pet test444(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response)
                throws Exception {
                        System.out.println("##### /pet/test444  called #####");
                        Optional<Pet> optionalPet = petRepository.findById(id);
                        
                        optionalPet.orElseThrow(()-> new Exception("No Entity Found"));
                        Pet pet = optionalPet.get();
                        petCommand.test444();
                        

                        return pet;
                        
                }

        
 }
