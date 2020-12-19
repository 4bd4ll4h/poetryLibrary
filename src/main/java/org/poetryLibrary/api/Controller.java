package org.poetryLibrary.api;


import org.poetryLibrary.api.module.java.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class Controller {

    private GraphQl graphQl;

    public Controller() {
        graphQl = new GraphQl();
    }


    @Autowired
    public Controller(GraphQl graphQl) {
        this.graphQl = graphQl;
    }

    @GetMapping("/AllPoet")
    public List<Poet> AllPoet(@RequestParam(value = "page", defaultValue = "1") Integer page) {
        return graphQl.AllPoet(page);
    }

    @GetMapping("/AllPoem")
    public List<PoemList> AllPoem(@RequestParam(value = "page", defaultValue = "1") Integer page) {
        return graphQl.AllPoem(page);
    }

    @GetMapping("/Poem")
    public List<Poem> Poem(@RequestParam(value = "poemName") String poemName) {
        return graphQl.Poem(poemName);
    }

    @GetMapping("/PoemInfo")
    public List<PoemInfo> PoemInfo(@RequestParam(value = "poemName") String poemName) {
        return graphQl.PoemInfo(poemName);
    }

    @GetMapping("/BarFromPoem")
    public BarFromPoem RandomBarFromPoem() {
        return graphQl.RandomBarFromPoem();
    }

    @GetMapping("/PoetInfo")
    public PoetInfo PoetInfo(@RequestParam(value = "poetName") String poetName) {
        {
            return graphQl.PoetInfo(poetName);
        }


    }
}
