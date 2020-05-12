package com.github.hcsp.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        Set<Character> charSet = new LinkedHashSet<>();
        //HashSet<Character> charSet = new HashSet<>();不要使用HashSet，因为其元素顺序是完全随机的。应该是LinkedHashSet.且SET集合是不能有重复有元素的
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
