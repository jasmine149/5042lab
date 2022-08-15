package com.demo.controller;
import com.demo.model.persistingRoom;
import com.demo.service.persistingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Map;
@Controller
public class persistingRoomController {
    @Autowired
    private persistingRoomService persistingRoomService;
    @RequestMapping(method = RequestMethod.GET,value="/")
    public String printHello(ModelMap model){
        model.addAttribute("message","Hello Spring MVC in maven");
        return "index";
    }
    @RequestMapping(method = RequestMethod.GET, value="/home")
    public ModelAndView home1(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("pageTitle","Home Page");
        modelAndView.addObject("message","Hi Welcome to Sprint MVC");
    return modelAndView;
    }
    @RequestMapping(method = RequestMethod.GET, value = "/persistingRoommanage")
    public ModelAndView home() {
        List<persistingRoom> listpersistingRoom = persistingRoomService.listAll();
        for (persistingRoom persistingRoom : listpersistingRoom) {
            System.out.println(persistingRoom.toString());
        }
        ModelAndView mav = new ModelAndView("persistingRoommanage");
        mav.addObject("listpersistingRoom", listpersistingRoom);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/new")
    public String newpersistingRoomForm(Map<String, Object> model) {
        persistingRoom persistingroom = new persistingRoom();
        model.put("persistingroom", persistingroom);
        return "newpersistingRoom";
    }
    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public String savepersistingRoom(@ModelAttribute("persistingroom") persistingRoom persistingroom) {
        persistingRoomService.save(persistingroom);
        return "redirect:/";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/edit")
    public ModelAndView editpersistingRoomForm(@RequestParam long id) {
        ModelAndView mav = new ModelAndView("editpersistingRoom");
        persistingRoom persistingroom = persistingRoomService.get(id);
        mav.addObject("persistingroom", persistingroom);
        return mav;
    }
    @RequestMapping(method = RequestMethod.GET, value ="/delete")
    public String deletepersistingRoomForm(@RequestParam long id) {
        persistingRoomService.delete(id);
        return "redirect:/persistingRoommanage";
    }
    @RequestMapping(method = RequestMethod.GET, value ="/search")
    public ModelAndView search(@RequestParam String keyword) {
        List<persistingRoom> result = persistingRoomService.search(keyword);
        ModelAndView mav = new ModelAndView("searchpersistingRoom");
        mav.addObject("result", result);
        return mav;
    }
}

