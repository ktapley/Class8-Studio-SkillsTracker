package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String heading(){
        return "<h1>Skills Tracker</h1>\n" +
                "<h2>We have a few skills we would like to learn. Here is the list:</h2>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>React</li>\n" +
                "</ol>";
    }

    @GetMapping("/form")
    public String form() {
        return "<form method='post'>\n" +
                "    Name:<br>\n" +
                "    <input type='text' name='name' />\n" +
                "    <br>My favorite language:<br>\n" +
                "    <select name='firstChoice'>\n" +
                "        <option value='Java'>Java</option>\n" +
                "        <option value='JavaScript'>JavaScript</option>\n" +
                "        <option value='React'>React</option>\n" +
                "    </select>\n" +
                "    <br>My second favorite language:<br>\n" +
                "    <select name='secondChoice'>\n" +
                "        <option value='Java'>Java</option>\n" +
                "        <option value='JavaScript'>JavaScript</option>\n" +
                "        <option value='React'>React</option>\n" +
                "    </select>\n" +
                "    <br>My third favorite language:<br>\n" +
                "    <select name='thirdChoice'>\n" +
                "        <option value='Java'>Java</option>\n" +
                "        <option value='JavaScript'>JavaScript</option>\n" +
                "        <option value='React'>React</option>\n" +
                "    </select>\n" +
                "    <input type='submit' value='Submit' />\n" +
                "</form>";
    }

    @PostMapping("/form")
    public String handleForm(@RequestParam String name, @RequestParam String firstChoice,
                             @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<h1>Hey there, "+name+"</h1>" +
                "<p>These were your favorite skills listed greatest to least:</p>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>"+
                "<li>" + thirdChoice + "</li>" +
                "</ol>";
    }


}
