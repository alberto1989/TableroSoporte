/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inforserveis;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 
 */
@Controller
@RequestMapping("/")
public class ControladorInicial {
    
    @RequestMapping("/")
    public String holita(){
         return "holita.html";
    }
    
}
