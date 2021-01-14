package cn.king.rule;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:14
 * @version: 1.0.0
 * @description: 编写一个腾讯的规则类，定义具体对于腾讯渠道数据的处理逻辑
 */
public class TencentChannelRule extends GeneralChannelRule{
    @Override
    public void process() {
        System.out.println("Tencent处理逻辑");
    }
}
