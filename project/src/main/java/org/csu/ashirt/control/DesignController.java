package org.csu.ashirt.control;

import org.csu.ashirt.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DesignController {
    @Autowired
    private DesignService designService;


}
