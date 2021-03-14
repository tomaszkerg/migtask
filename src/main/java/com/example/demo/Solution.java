package com.example.demo;

import java.util.HashSet;

public class Solution {

    private String sqlSolutionForTask3first = "SELECT country.name FROM country\n" +
            "    INNER JOIN city c ON country.id = c.country_id\n" +
            "WHERE 400 < ALL (SELECT c.population FROM city\n" +
            "WHERE c.country_id=country.id);";//here maybe i should delete INNER JOIN section
    // because doing query inside query joins tables automatically but i leave it as raw version

    private String sqlSolutionFromTask3second = "SELECT * FROM country\n" +
            "WHERE 0 = (SELECT COUNT(1) FROM city c\n" +
            "    JOIN building b ON b.city_id = c.id\n" +
            "WHERE c.country_id=country.id);";

    public int solution(int N){
        int x = Math.abs(N);
        HashSet<Integer> hashset = new HashSet<>();
        do{
            hashset.add(x % 10);
            x /= 10;
        } while  (x > 0);
        return hashset.size();
    }

    public int solution(int A, int B, int K){
        if(K == 0) return 0;
        int moduloL = A % K;
        int moduloR = B % K;
        int l = A / K;
        int r = B / K;
        if(moduloL == 0 || moduloR == 0) return r - l + 1;
        return r - l;
    }
}
