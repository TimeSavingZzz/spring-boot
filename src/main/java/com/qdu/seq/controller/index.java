package com.qdu.seq.controller;

import com.qdu.seq.util.IEquationPrinter;
import com.qdu.seq.util.IPaper;
import com.qdu.seq.util.SimpleEquationPrinter;
import com.qdu.seq.util.TestPaper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@EnableAutoConfiguration
public class index {

    @RequestMapping({"/"})
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/proceed"}, method = {RequestMethod.POST})
    public Map<String,List> execute(String number, int operator, boolean showanswer, Model model) {
        Map<String,List> map = new HashMap<>();
        if (number.equals("")) {
            List list = new ArrayList();
            list.add("错误");
            map.put("msg",list);
            return map;
        } else {
            int bound = 100;
            int questionsEachLine = 5;
            IPaper testPaper = new TestPaper(Integer.parseInt(number), bound, operator);
            IEquationPrinter equationPrinter = new SimpleEquationPrinter();
            List list = null;
            if (!showanswer) {
                list =  equationPrinter.printPaper(testPaper, questionsEachLine, false);
                map.put("list1",list);
                return map;
            }
            list = equationPrinter.printPaper(testPaper, questionsEachLine, showanswer);
            map.put("list2",list);
            return map;
        }
    }
}
