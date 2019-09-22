package com.github.hcsp.collection;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        // HashSet 背后是 HashTable
        // 不能保证元素的顺序，所以去重后会按照 hashcode 值排序
        // 改用 LinkedHashSet
        // 保证元素添加的顺序：LinkedHashSet
        // 保证元素自然的顺序：TreeSet
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

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
