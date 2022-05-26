package leetcode.editor.cn;
//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 2071 👎 0

class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 1){
                return strs[0];
            }
            String pre = strs[0];
            String res = "";
            for (int i = 1; i < strs.length; i++) {
                StringBuilder sb = new StringBuilder();
                char[] chars = pre.toCharArray();
                char[] cs = strs[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (j >= cs.length) {
                        break;
                    }
                    if (chars[j] == cs[j]){
                        sb.append(chars[j]);
                    } else {
                        break;
                    }
                }
                pre = sb.toString();
                res = sb.toString();
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}