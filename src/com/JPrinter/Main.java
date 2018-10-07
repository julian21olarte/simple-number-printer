package com.JPrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(in.hasNext()) {
            String line = in.nextLine();
            System.out.println(print(line));
        }
    }

    private static String print(String line) {
        int height = 5;

        int length = line.length();
        ArrayList<ArrayList<Character>> res = new ArrayList<>();
        for (int i = 0; i < height; i++)
            res.add(new ArrayList<>());

        for(int i = 0; i < length; ++i) {
            try {
                Character[][] map = getMap(Integer.parseInt(Character.toString(line.charAt(i))));
                for (int j = 0; j < map.length; j++) {
                    res.get(j).addAll(Arrays.asList(map[j]));
                    res.get(j).add(new Character(' '));
                }
            } catch(Exception ex) {
                return "Invalid input";
            }
        }
        return printAll(res);
    }

    private static String printAll(ArrayList<ArrayList<Character>> list) {
        return list.stream().map(
            a -> a.stream()
            .map(e -> e.toString())
            .collect(Collectors.joining()) + "\n")
        .collect(Collectors.joining());
    }

    private static Character[][] getMap(int number) {
        Character[][] res;
        switch (number) {
            case 0: res = new Character[][] {
                    {'*', '*', '*'},
                    {'*', ' ', '*'},
                    {'*', ' ', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'}}; break;
            case 1: res = new Character[][] {
                    {' ', '*', ' '},
                    {' ', '*', ' '},
                    {' ', '*', ' '},
                    {' ', '*', ' '},
                    {' ', '*', ' '}}; break;
            case 2: res = new Character[][] {
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {'*', '*', '*'},
                    {'*', ' ', ' '},
                    {'*', '*', '*'}}; break;
            case 3: res = new Character[][] {
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {' ', '*', '*'},
                    {' ', ' ', '*'},
                    {'*', '*', '*'}}; break;
            case 4: res = new Character[][] {
                    {'*', ' ', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {' ', ' ', '*'}}; break;
            case 5: res = new Character[][] {
                    {'*', '*', '*'},
                    {'*', ' ', ' '},
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {'*', '*', '*'}}; break;
            case 6: res = new Character[][] {
                    {'*', '*', '*'},
                    {'*', ' ', ' '},
                    {'*', '*', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'}}; break;
            case 7: res = new Character[][] {
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {' ', ' ', '*'},
                    {' ', ' ', '*'},
                    {' ', ' ', '*'}}; break;
            case 8: res = new Character[][] {
                    {'*', '*', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'}}; break;
            case 9: res = new Character[][] {
                    {'*', '*', '*'},
                    {'*', ' ', '*'},
                    {'*', '*', '*'},
                    {' ', ' ', '*'},
                    {' ', ' ', '*'}}; break;
            default: return null;
        }
        return res;
    }
}
