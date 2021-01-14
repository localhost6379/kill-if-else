package cn.king.test.ifelse;


import cn.king.enumeration.ChannelRuleEnum;
import cn.king.rule.GeneralChannelRule;
import cn.king.rule.TencentChannelRule;
import cn.king.rule.TouTiaoChannelRule;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:18
 * @version: 1.0.0
 * @description:
 */
public class Demo01 {
    public static void main(String[] args) {
        //这里我们模拟接收到的数据，其渠道为为TOUTIAO，来自头条的数据
        String sign = "TOUTIAO";
        GeneralChannelRule rule = null;
        //根据对应渠道获取对应的具体规则实现类
        if (ChannelRuleEnum.TENCENT.getCode().equals(sign)) {
            rule = new TencentChannelRule();
        } else if (ChannelRuleEnum.TOUTIAO.getCode().equals(sign)) {
            rule = new TouTiaoChannelRule();
        } else {
            //匹配不到
        }
        //执行
        rule.process();
    }

    /*
     解析：如果通过上面的方式，则存在则两个缺点。

     当我们需要新增新的渠道的时候，需要对main方法中的逻辑进行修改调整。这违背了设计模式中的开放封闭规则。开放封闭原bai则的核心的思想是软件实体是可扩du展，而不可zhi修改的。

     也就是说，对扩展是开dao放的，而对修改是封闭的

     新增渠道后，修改代码会产生大量的if else，不太优雅。为了解决以上的两个问题，我们可以借助枚举类来巧妙优化。
     */
}


