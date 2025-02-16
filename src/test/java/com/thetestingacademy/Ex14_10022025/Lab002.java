package com.thetestingacademy.Ex14_10022025;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class Lab002 {
public static void main(String args[]) {
            int count[] = {2, 4, 3, 5,5 };
            Set<Integer> hset = new HashSet<Integer>();
            try {
                for (int i = 0; i < 4; i++) {
                    hset.add(count[i]);
                }
                System.out.println(hset);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }




