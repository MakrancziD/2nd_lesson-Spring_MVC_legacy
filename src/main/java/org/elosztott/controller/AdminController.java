package org.elosztott.controller;

import com.google.common.base.Strings;
import org.elosztott.model.NewUserRequest;
import org.elosztott.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.elosztott.service.UserManager;

import javax.validation.Valid;
import java.util.ArrayList;

/**
 * Created by makra on 2016. 09. 19..
 */

@Controller
@RequestMapping("/admin")
public class AdminController
{
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    public String status() { return "status"; }

    @RequestMapping(value = "/get_balance", method = RequestMethod.GET)
    public String getBalance() { return "get_balance"; }

    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String showForm(@ModelAttribute NewUserRequest userForm) {
        return "new_user";
    }

    @RequestMapping(value = "/new_user", method = RequestMethod.POST)
    public String checkUserForm(@ModelAttribute @Valid NewUserRequest newUserRequest, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "new_user";
        }
        User user = new User(
                newUserRequest.getUsername(),
                newUserRequest.getVegzettseg(),
                new ArrayList<String>(),//newUserRequest.getColor()),
                newUserRequest.getNem()
        );
        userManager.addUser(user);

        return "redirect:/admin/status";
    }
}
