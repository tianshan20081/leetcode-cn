# leetcode
-----

## 模板配置
Customer Template 
tempFilePath: `/Users/sc/Git/Java/leetcode/src/main/java/com`

CodeFileName: `P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})`

CodeTemplate:
```
${question.content}
package com.leetcode.editor.cn;
//java:${question.title}
public class P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args){
        Solution solution = new P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
    }
    ${question.code}
}
```