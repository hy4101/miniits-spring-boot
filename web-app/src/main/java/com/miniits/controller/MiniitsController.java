    package com.miniits.controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.ResponseBody;

    /**
     * @author: miniits
     * @Date:
     * @Time: <p>
     * Description:
     */
    @Controller
    @RequestMapping("/miniits")
    public class MiniitsController {

        @RequestMapping("index.html")
        @ResponseBody
        public String index(){
            return "你好！迷你科技";
        }
    }
