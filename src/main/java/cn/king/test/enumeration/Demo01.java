package cn.king.test.enumeration;

import cn.king.enumeration.ChannelRuleEnumeration;
import cn.king.rule.GeneralChannelRule;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:27
 * @version: 1.0.0
 * @description:
 */
public class Demo01 {
    public static void main(String[] args) {
        //String sign = "TOUTIAO";
        //String sign = "TENCENT";
        String sign = "ALIBABA";
        ChannelRuleEnumeration channelRule = ChannelRuleEnumeration.match(sign);
        GeneralChannelRule rule = channelRule.channel;
        rule.process();
    }

    /*
      解析：通过使用枚举类，在枚举中将 key 与 规则具体实现进行绑定。通过改变：

      可以减少if -else使得代码更加优雅 如果需要新增渠道，我们只需要在编写具体规则实现类并继承GeneralChannelRule抽象类，并在枚举类中新增的枚举，而不需要改动到原先的任何代码。这符合了开发封闭原则。
     */
}
