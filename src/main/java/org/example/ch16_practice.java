package org.example;

import java.util.*;

import static java.lang.Math.random;

public class ch16_practice {
    public static void main(String[] args) {
        //1
        Ball<String> b1 = new Ball<>();
        Ball<Integer> b2 = new Ball<>();
        Ball<Double> b3 = new Ball<>();
        b1.setColor("red");
        b2.setColor(255);
        b3.setColor(255.0);
        b1.show();
        b2.show();
        b3.show();

        //3
        HashSet<Integer> h1 = new HashSet<>();
        h1.add(36);
        h1.add(15);
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(52);
        t1.add(23);
        t1.add(32);
        t1.add(69);
        t1.add(10);
        t1.add(7);
        t1.add(36);
        t1.add(15);
        System.out.println("HashSet h1內容: "+h1);
        System.out.println("TreeSet t1內容: "+t1);
        if(t1.contains(32)){
            t1.remove(32);
            System.out.println("new t1內容: "+t1);
        }else{
            System.out.println("there is no 32 in t1");
        }
        if (t1.containsAll(h1)){
            System.out.println("yes, ti contains h1");
        }else{
            System.out.println("no");
        }

        //5
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Speech is silver, silence id golden.");
        tset.add("Two heads are better than one.");
        tset.add("East or West, home is best.");
        tset.add("It is never too late to learn.");
        System.out.println("all: "+tset);
        System.out.println("first: "+tset.first());
        System.out.println("last: "+tset.last());
        System.out.println("<Speech: "+tset.headSet("Speech"));

        //7
        LinkedList<String> llist = new LinkedList<>();
        llist.add("apple");
        llist.add("guava");
        System.out.println("llist: "+llist);
        ArrayList<String> alist = new ArrayList<>();
        alist.add("tomato");
        alist.add("apple");
        alist.add("papaya");
        alist.add("grape");
        System.out.println("alist: "+alist);
        //alist.add(String.valueOf(llist));
        //寫錯, output為 new alist: [tomato, apple, papaya, grape, [apple, guava]]
        alist.addAll(llist);
        System.out.println("new alist: "+alist);
        System.out.println("alist first apple index: "+alist.indexOf("apple"));
        System.out.println("alist last apple index: "+alist.lastIndexOf("apple"));

        //9
        HashMap<Integer, Integer> hmap = new HashMap<>();
//        詳解
//        for(int i=0;i<5;i++)
//            hmap.put(i,(int)(100*Math.random()));
        hmap.put(0, (int) (random() * 100));
        hmap.put(1, (int) (random() * 100));
        hmap.put(2, (int) (random() * 100));
        hmap.put(3, (int) (random() * 100));
        hmap.put(4, (int) (random() * 100));
        TreeSet<Integer> tset2 = new TreeSet<>(hmap.values());
        HashSet<Integer> hset2 = new HashSet<>(hmap.keySet());
        System.out.println("hmap: "+hmap);
        System.out.println("tset2: "+tset2);
        System.out.println("hset2: "+hset2);

        //11
//        TreeMap<Integer, Integer> tmap = new TreeMap<>();
//
//        for(int i=0; i<5; i++){
//            tmap.put(i, (int) (random()*100));
//        }
//        System.out.println("tmap: "+tmap);
//
//        HashSet<Integer> hset3 =new HashSet<>();
//        int key = 0;
//        while (key<=100){
//            if(tmap.containsKey(key)){
//                hset3.add(key);
//            }key++;
//        }
//        System.out.println("hset3: "+hset3);

        //詳解
        int count=0,key=0;
        TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();

        while(count<=4){
            key=(int)(100*Math.random());
            if(!tmap.containsKey(key)){
                tmap.put(key,count);
                count++;
            }
        }
        System.out.println("TreeMap集合內容: "+tmap);

        HashSet<Integer> hset=new HashSet<Integer>();
        key=0;
        while(key<=100){
            if(tmap.containsKey(key))
                hset.add(key);
            key++;
        }
        System.out.println("HashSet集合內容: "+hset);

        //13
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<10; i++){
            al.add((int) (random()*100));
        }
        for (int item:al) {
            System.out.print(item+" ");
        }
        System.out.println();

        //15
        LinkedList<Integer> ll = new LinkedList<>();
        int sum = 0;
        for (int i=0; i<10; i++){  //add亂數到ll
            ll.add((int) (random()*100));
        }
        for(int j=0; j<ll.size();j++){   //加總ll裡的元素
            sum+=ll.get(j);
        }

        ListIterator<Integer> listIterator = ll.listIterator();
        System.out.print("正向走訪: ");
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        System.out.print("\n反向走訪: ");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }

        System.out.println("\nll sum: "+sum);
    }
}

class Ball<T>{
    public T color;

    public void setColor(T value){
        color = value;
    }
    public void show(){
        System.out.println("color= "+color);
    }
}

