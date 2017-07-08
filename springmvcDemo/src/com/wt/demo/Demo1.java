package com.wt.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by wang on 2017/7/3.
 */
@Controller
public class Demo1 {
    @RequestMapping(value = "/user/getUser",method = RequestMethod.POST)
    public ModelAndView getUser(@RequestParam("name")String name , @RequestParam(value = "type",required = true)int type){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","haha:"+name) ;
        return  modelAndView ;
    }

    public static void main(String[] args) {
        Integer num = 3 ;
        Integer[] data = {8,2,4,1,5,6,7};
        List list = Arrays.asList(data);
//        Collections.reverse(list);
        Collections.sort(list);
        Integer[] arr = (Integer[]) list.toArray();
        Demo1 demo1 = new Demo1();
        int index = demo1.getIndexOfArray(arr, num);
        System.out.println(index);
        System.out.println(list.toString());

    }

    public int getIndexOfArray(Integer[] array,Integer num){
        int top = array.length ;
        int low = 0 ;

        while (low<top){
            int mid = (low+top)/2 ;
            int val = array[mid] ;
            if(num==val){
                return  mid ;
            }
            if(num>val){
                low = mid+1 ;
            }else {
                top = mid-1 ;
            }

            System.out.println(low+"!!!"+top);
        }
        return  -1;
    }


}
