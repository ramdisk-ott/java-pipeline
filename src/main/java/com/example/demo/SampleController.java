package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class SampleController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String test() {
        return "test api  26";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Asset> list() {
        List<Asset> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Asset asset = new Asset();
            asset.setID((i + 1) + "");
            asset.setSize((1) + "");
            asset.setOwner("Owner-" + (i + 1));
            list.add(asset);
        }
        return list;
    }
}
