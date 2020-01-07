package com.github.hcsp.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        Set<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (Character ch : charSet) {
            result.append(ch);
        }

        return result.toString();
    }
}
