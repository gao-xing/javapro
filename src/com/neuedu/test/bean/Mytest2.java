package com.neuedu.test.bean;

import java.util.*;

/**
 * Created by 高星 on 2020/2/13.
 */
public class Mytest2{
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        int player = scanner.nextInt ();
        if (player>18||player<12){
            System.out.println ("不符合游戏人数");
        }else{
            List<String> all=new ArrayList<> ();
            List<String> play=new ArrayList<> ();
            List<String> di=new ArrayList<> ();
            init (all);
            pai (all,player);
            all.remove ("盗贼");
            play.add ("盗贼");
            dipai (all,di);
            play.addAll (all);
            Collections.shuffle (play);
            System.out.println ("手牌:"+play);
            System.out.println ("底牌:"+di);
        }
    }
    public static void init(List<String>list){
        for (int i=0;i<4;i++) {
            list.add("狼人");
        }
        for(int i=0;i<4;i++){
            list.add("村民");
        }
        list.add ("预言家");
        list.add ("女巫");
        list.add ("丘比特");
        list.add ("守护");
        list.add ("猎人");
        list.add ("村长");
        list.add ("盗贼");
    }
    public static void pai(List<String> list,int player){
        if (player>12)
            list.add ("村民");
        if (player>13)
            list.add ("替罪羊");
        if (player>14)
            list.add ("狼人");
        if (player>15)
            list.add ("村民");
        if (player>16)
            list.add ("村民");
        if (player>17)
            list.add ("吹笛着");
    }
    public static void dipai(List<String>list,List<String>di){
        while (di.size ()<3){
            Random random=new Random ();
            int index=random.nextInt (list.size ());
            if (di.contains ("狼人")&&list.get (index).equals ("狼人"))
                continue;
            else
            di.add (list.remove (index));
        }
    }
}

