package com.github.hcsp.collection;

import java.util.HashSet;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        HashSet<Character> charSet = new HashSet<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (charSet.add(s.charAt(i))) {
                result += s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateCharsInString("ccbbaa"));
        System.out.println(removeDuplicateCharsInString("apple"));
    }
}
