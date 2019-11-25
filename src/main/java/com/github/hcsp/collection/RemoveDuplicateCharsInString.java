package com.github.hcsp.collection;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateCharsInString {
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        List<Character> list = new ArrayList<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (!list.contains(s.charAt(i))) {
                list.add(s.charAt(i));
            }
        }
        for (Character ch : list) {
            result += ch;
        }
        return result;
    }
}
