package cn.king.enumeration;

import cn.king.rule.GeneralChannelRule;
import cn.king.rule.TencentChannelRule;
import cn.king.rule.TouTiaoChannelRule;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:25
 * @version: 1.0.0
 * @description:
 */
public enum ChannelRuleEnumeration {
    /**
     * 头条
     */
    TOUTIAO("TOUTIAO", new TouTiaoChannelRule()),
    /**
     * 腾讯
     */
    TENCENT("TENCENT", new TencentChannelRule()),
    /**
     * 阿里
     */
    ALIBABA("ALIBABA", new AlibabaChannelRule()),
    ;

    public String name;

    public GeneralChannelRule channel;

    ChannelRuleEnumeration(String name, GeneralChannelRule channel) {
        this.name = name;
        this.channel = channel;
    }

    //匹配
    public static ChannelRuleEnumeration match(String name) {
        ChannelRuleEnumeration[] values = ChannelRuleEnumeration.values();
        for (ChannelRuleEnumeration value : values) {
            if (value.name.equals(name)) {
                return value;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public GeneralChannelRule getChannel() {
        return channel;
    }

    // 编写一个阿里的规则类，定义具体对于阿里渠道数据的处理逻辑
    static class AlibabaChannelRule extends GeneralChannelRule {
        @Override
        public void process() {
            System.out.println("Alibaba处理逻辑");
        }
    }

}
