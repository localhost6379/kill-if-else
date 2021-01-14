package cn.king.enumeration;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:17
 * @version: 1.0.0
 * @description: 建立一个简单的枚举类
 */
public enum ChannelRuleEnum {
    /**
     * 头条
     */
    TOUTIAO("TOUTIAO"),
    /**
     * 腾讯
     */
    TENCENT("TENCENT"),
    ;

    private String code;

    ChannelRuleEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
