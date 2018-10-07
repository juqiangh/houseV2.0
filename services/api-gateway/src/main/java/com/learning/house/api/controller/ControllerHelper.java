package com.learning.house.api.controller;

import com.learning.house.api.common.ResultMsg;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Map;

public class ControllerHelper {
  
  public static void addFlashAttributes(RedirectAttributes redirectAttributes, Map<String, String> map){
    map.forEach((key,value)-> redirectAttributes.addFlashAttribute(key, value));
  }
  
  public static void addFlashAttributes(RedirectAttributes redirectAttributes, ResultMsg resultMsg){
     addFlashAttributes(redirectAttributes, resultMsg.asMap());
  }

}
