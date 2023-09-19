package org.example;

import java.util.*;

import static java.lang.Math.random;

public class ch16_practice {
    public static void main(String[] args) {
        //1
        System.out.println("Q1:");
        Ball<String> b1 = new Ball<>();
        Ball<Integer> b2 = new Ball<>();
        Ball<Double> b3 = new Ball<>();
        b1.setColor("red");
        b2.setColor(255);
        b3.setColor(255.0);
        b1.show();
        b2.show();
        b3.show();

        //2
        System.out.println("\nQ2:");
        Circle1602<Double> c1 = new Circle1602<>();
        Circle1602<String> c2 = new Circle1602<>();
        c1.setValue(2.0);
        c2.setValue("Blue");
        c1.show();
        c2.show();

        //3
        System.out.println("\nQ3:");
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

        //4
        System.out.println("\nQ4:");
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(65);
        hashSet.add(29);
        hashSet.add(18);
        hashSet.add(34);
        System.out.println("hashset內容="+hashSet);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(97);
        treeSet.add(62);
        treeSet.add(53);
        System.out.println("treeset內容="+treeSet);
        treeSet.addAll(hashSet);
        System.out.println("new treeset內容="+treeSet);
        double avg = (double) (treeSet.first() + treeSet.last()) /2;
        System.out.println("treeSet.first+treeSet.last之平均="+avg);

        //5
        System.out.println("\nQ5:");
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Speech is silver, silence id golden.");
        tset.add("Two heads are better than one.");
        tset.add("East or West, home is best.");
        tset.add("It is never too late to learn.");
        System.out.println("all: "+tset);
        System.out.println("first: "+tset.first());
        System.out.println("last: "+tset.last());
        System.out.println("<Speech: "+tset.headSet("Speech"));

        //6
        System.out.println("\nQ6:");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add((int) (random()*100));
        linkedList.add((int) (random()*100));
        linkedList.add((int) (random()*100));
        linkedList.add((int) (random()*100));
        linkedList.add((int) (random()*100));
        System.out.println("linkedlist內容="+linkedList);
        linkedList.add(150);
        linkedList.add(55);
        linkedList.add(10);
        System.out.println("new linkedlist內容="+linkedList);
        linkedList.set(5,999);
        System.out.println("newer linkedlist內容="+linkedList);
        System.out.println("linkedlist.getfirst="+linkedList.getFirst());
        System.out.println("linkedlist.getlast="+linkedList.getLast());
        System.out.println("linkedlist[2]~[5]="+linkedList.subList(2,5));

        //7
        System.out.println("\nQ7:");
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

        //8
        System.out.println("\nQ8:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Homer sometimes nods.");
        arrayList.add("Beauty is in the eye of beholder.");
        arrayList.add("Example os better than precept.");
        arrayList.add("Learn to walk before you run.");
        arrayList.add("Make hay before the sun shines.");
        for(String i:arrayList){
            System.out.println(i);
        }

        //9
        System.out.println("\nQ9:");
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

        //10
        System.out.println("\nQ10:");
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,(int) (random() * 100));
        treeMap.put(2,(int) (random() * 100));
        treeMap.put(3,(int) (random() * 100));
        treeMap.put(4,(int) (random() * 100));
        treeMap.put(5,(int) (random() * 100));
        System.out.println("treeMap內容="+treeMap);
        int treeMapSum=0;
        double treeMapAvg = 0;
        for(int i: treeMap.values()){
            treeMapSum+=i;
            treeMapAvg= (double) treeMapSum /treeMap.size();
        }
        System.out.println("treeMap.values加總="+treeMapSum+", 平均="+treeMapAvg);

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
        System.out.println("\nQ11:");
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

        //12
        System.out.println("\nQ12:");
        HashMap<String,Integer> test = new HashMap<>();
        test.put("Ryan",95);
        test.put("Fiona",83);
        test.put("Jack",89);
        test.put("Kevin",76);
        test.put("Ariel",92);
        System.out.println("test內容="+test);
        double avgTest = (double) (test.get("Ariel") + test.get("Fiona")) /2;
        int subTest = test.get("Kevin")-test.get("Jack");
        System.out.println("Ariel跟Fiona的平均值="+avgTest+"\nKevin跟Jack相差="+subTest);

        //13
        System.out.println("\nQ13:");
        ArrayList<Integer> al = new ArrayList<>();
        for (int i=0; i<10; i++){
            al.add((int) (random()*100));
        }
        for (int item:al) {
            System.out.print(item+" ");
        }
        System.out.println();

        //14
        System.out.println("\nQ14:");
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add((int) (random()*100));
        ts.add((int) (random()*100));
        ts.add((int) (random()*100));
        ts.add((int) (random()*100));
        ts.add((int) (random()*100));
        System.out.println("ts內容="+ts);
        int sumTs=0;
        for (int i: ts){
            sumTs+=i;
        }
        double avgTs = (double) sumTs /ts.size();
        System.out.println("avgTs="+avgTs);

        //15
        System.out.println("\nQ15:");
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

        //16
        System.out.println("\nQ16:");
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Monday");
        arr.add("Tuesday");
        arr.add("Wednesday");
        arr.add("Thursday");
        arr.add("Friday");
        arr.add("Saturday");
        arr.add("Sunday");
        ListIterator<String> arrIter = arr.listIterator();
        System.out.print("正向走訪: ");
        while(arrIter.hasNext()){
            System.out.print(arrIter.next()+" ");
        }
        System.out.print("\n反向走訪: ");
        while(arrIter.hasPrevious()){
            System.out.print(arrIter.previous()+" ");
        }
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
}   //1

class Circle1602<T>{
    public T value;

    void setValue(T value){
        this.value = value;
    }

    void show(){
        System.out.println("value="+value);
    }
}   //2

