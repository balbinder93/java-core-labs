package com.qa.automation.core;

public class MultiplicationTable {
    public static String generateTable(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=10;i++){
            sb.append(n).append(" ").append("x").append(" ").append(i).append(" ").append("=").append(" ").append(n*i).append("\n");
        }
        return sb.toString().trim();
    }
}
