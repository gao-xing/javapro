package com.neuedu.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetAndMap_Text {
    public static void main(String[] args) {
        char [] str ={'0','1','2','x','y','0'};
        for(int k=0;str[k]!='0';k++){
            System.out.println(str[k]);
        }
        Set <Integer> set =new HashSet<>();//<数据类型(包装类)> 代表泛型，规范数据类型
        set.add(1);//set中如果有重复的内容会进行覆盖
        set.add(2);
        set.add(3);
        set.add(2);
        for(Object obj:set){
            System.out.println(obj);//Set没有get方法，只能用增强for遍历
        }
        Map <String,String> map =new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("002","王六");
        Set <String> keys=map.keySet();
        for(String key:keys){
            System.out.println(map.get(key));
        }


    }
}
