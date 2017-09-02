package io.ushi.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouleibo on 2017/8/30.
 */
@RestController
@RequestMapping("/doc")
public class DemoController {

    @RequestMapping(value = "/group/{id}/artifacts", method = RequestMethod.GET)
    public List<String> artifacts(@PathVariable("id") String groupId) {

        List<String> g1 = new ArrayList<String>();
        g1.add("A");
        g1.add("B");

        List<String> g2 = new ArrayList<String>();
        g2.add("C");
        g2.add("D");

        Map<String, List<String>> mock = new HashMap<String, List<String>>();
        mock.put("g1", g1);
        mock.put("g2", g2);

        return mock.get(groupId);
    }
}
