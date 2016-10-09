package org.elosztott.controller;

import com.google.common.base.Strings;
import org.elosztott.model.NewUserRequest;
import org.elosztott.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.elosztott.service.UserManager;

import javax.validation.Valid;

/**
 * Created by makra on 2016. 09. 19..
 */

@Controller
public class AdminController
{
    @Autowired
    private UserManager userManager;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

    @RequestMapping(value = "/admin/status", method = RequestMethod.GET)
    public String status() { return "status"; }

    @RequestMapping(value = "/get_balance", method = RequestMethod.GET)
    public String getBalance() { return "admin/get_balance"; }

    @RequestMapping(value = "/new_user", method = RequestMethod.GET)
    public String showForm(NewUserRequest userForm) {
        return "admin/new_user";
    }

    @RequestMapping(value = "/new_user", method = RequestMethod.POST)
    public String checkUserForm(@Valid NewUserRequest personForm, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "admin/new_user";
        }

        return "redirect:/results";
    }
   /* @RequestMapping(value = "admin/new_user", method = RequestMethod.GET)
    public String new_user(NewUserRequest newUserReq)
    {
        if(Strings.isNullOrEmpty(newUserReq.getUsername()))
        {
            return "admin/new_user";
        }
        else
        {
            userManager.addUser(new User(
                    newUserReq.getUsername(),
                    newUserReq.getCredit(),
                    newUserReq.getVegzettseg(),
                    newUserReq.getColor(),
                    newUserReq.getNem()
            ));
            return "admin/status";
        }
    }*/
}
