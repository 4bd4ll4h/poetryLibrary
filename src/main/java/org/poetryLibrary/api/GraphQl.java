package org.poetryLibrary.api;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.poetryLibrary.api.module.java.Entities.*;
import org.poetryLibrary.api.module.java.Repository.SQLRepository;
import org.springframework.stereotype.Component;
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
    public List<PoemList> AllPoem(Integer page){
        return repository.Allpoem(page);
    }
    public List<Poem> Poem(String poemName){
        return repository.Poem(poemName);
    }
    public List<PoemInfo> PoemInfo(String poemName){
        return repository.PoemInfo(poemName);
    }
    public BarFromPoem RandomBarFromPoem(){
        return repository.Bar();
    }
    public PoetInfo PoetInfo(String poetName){
        return repository.PoetInfo(poetName);
    }

}
