package com.bjsxt.springbootmybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hanyueqian
 * @date 2020/1/5 0005-下午 20:42
 */
@Controller
public class PageController
{
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page)
    {
        return page;
    }
}
