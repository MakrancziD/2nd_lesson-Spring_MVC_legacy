package elosztott;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by makra on 2016. 09. 19..
 */

@Controller
public class BookController
{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String index()
    {
        return "Hello!";
    }
}
