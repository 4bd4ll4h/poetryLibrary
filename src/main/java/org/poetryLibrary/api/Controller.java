package org.poetryLibrary.api;

import graphql.ExecutionResult;
import graphql.kickstart.servlet.osgi.GraphQLQueryProvider;
import graphql.schema.GraphQLCodeRegistry;
import org.hibernate.graph.Graph;
import org.poetryLibrary.SQLServerRepository.Entities.PoetInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class Controller {

    private GraphQl graphQl;
    @Autowired
    public Controller(GraphQl graphQl) {
        this.graphQl = graphQl;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }


}
