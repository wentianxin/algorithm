package dfs;

public class Solution {
//    private int count = 0;
//
//    public String decodeString1(String s) {
//        for (int i = 0; i < s.length();) {
//
//        }
//        return null;
//    }
//
//    private String decodeString(String s) {
//        StringBuffer sb = new StringBuffer();
//        int num = 1;
//        try {
//            num = Integer.valueOf(s.charAt(0));
//        } catch (Exception e) {num=1;}
//
//        if (num == 1) {
//            for (int i = 0; i < s.length(); i++) {
//                sb.append(s.get(i));
//            }
//        }
//        int level = 0;
//        for (int i = 0; i < num; i++) {
//            for (int j = 2; j < s.length(); j++) {
//                if (s.get(j)){
//                    sb.append(decodeString(s.subString(j)));
//                }
//                if (s.get(j) == ']') {
//                    break;
//                }
//                sb.append(s.get(j));
//            }
//        }
//        return sb.toString();
//    }
}