/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thesoftwareguild.contactlistmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author bretthanson
 */
@Controller
public class SearchController {
    @RequestMapping(value="/search", method=RequestMethod.GET)
    public String displaySearchPage()
    {
        return "search";
    }
}
