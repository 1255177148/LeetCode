package leetcode.editor.cn;
//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 3109 👎 0

import java.util.Stack;

class ValidParentheses{
    public static void main(String[] args){
        Solution solution = new ValidParentheses().new Solution();
        System.out.println(solution.isValid("{[]}"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c : chars){
            // 如果是左边的括号，直接入栈
            if ('(' == c || '[' == c || '{' == c){
                stack.push(c);
            } else { // 如果是右边的括号
                // 如果栈不为空，则对出对应的括号
                if (!stack.empty()){
                    if (')' == c && stack.pop() != '('){
                        return false;
                    }
                    if (']' == c && stack.pop() != '['){
                        return false;
                    }
                    if ('}' == c && stack.pop() != '{'){
                        return false;
                    }
                } else {
                    // 如果栈为空，但是遇到的是右边的括号
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}