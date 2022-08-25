package petshop.infra;
import petshop.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PetHateoasProcessor implements RepresentationModelProcessor<EntityModel<Pet>>  {

    @Override
    public EntityModel<Pet> process(EntityModel<Pet> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/feed").withRel("feed"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/unregister").withRel("unregister"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test").withRel("test"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test2zzzz").withRel("test2zzzz"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/test333").withRel("test333"));
        
        return model;
    }
    
}

