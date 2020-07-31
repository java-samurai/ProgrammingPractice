package com.general.problems;

import org.junit.Test;

import java.util.List;

public class SkyLineProblemTest {
    private  SkylineProblem skylineProblem = new SkylineProblem();

    @Test
    public void test1(){
        int[][] inputBuildings = {{2,9,10},
                                 {3,7,15},
                                 {5,12,12},
                                {15,20,10},
                                {19,24,8}};
        List<List<Integer>> skyline = skylineProblem.getSkyline(inputBuildings);
        System.out.println(skyline);
    }

    @Test
    public void test2(){
        int[][] inputBuildings = {{0,2,3}, {2,5,3}};
        List<List<Integer>> skyline = skylineProblem.getSkyline(inputBuildings);
        System.out.println(skyline);
    }
}