package org.poetryLibrary.api;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.poetryLibrary.SQLServerRepository.Entities.Poet;
import org.poetryLibrary.SQLServerRepository.Repository.SQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Component
public class GraphQl implements GraphQLQueryResolver {
    private SQLRepository repository;

    public GraphQl() {
        repository=new SQLRepository();
    }

    public List<Poet> AllPoet(Integer page){
        return repository.AllPoet(page);
    }
}
