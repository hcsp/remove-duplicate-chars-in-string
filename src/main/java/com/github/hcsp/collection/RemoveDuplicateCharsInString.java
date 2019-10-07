package com.github.hcsp.collection;

import java.util.*;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        HashSet<Character> charSet = new HashSet<>();
        List<Character> order = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (order.indexOf(s.charAt(i)) == -1) {
                order.add(s.charAt(i));
            }
        }
        String result = "";
        for (Character ch : order) {
            result += order.get(order.lastIndexOf(ch));
        }

        return result;
    }
}

