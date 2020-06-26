package com.github.hcsp.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        HashSet<Character> charSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        List<Character> list = new ArrayList<>();
        for (int index = 0; index < s.length(); index++) {
            for (Character character : charSet) {
                if (list.contains(s.charAt(index))) {
                    continue;
                }
                if (s.charAt(index) == character) {
                    list.add(character);
                }
            }
        }

        String result = "";
        for (Character ch : list) {
            result += ch;
        }
        return result;
    }
}
