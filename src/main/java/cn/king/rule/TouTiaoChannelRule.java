package cn.king.rule;

/**
 * @author: wjl@king.cn
 * @time: 2021/1/14 22:15
 * @version: 1.0.0
 * @description: 编写一个头条的规则类，定义具体对于头条数据的处理逻辑
 */
public class TouTiaoChannelRule extends GeneralChannelRule{
    @Override
    public void process() {
        System.out.println("TouTiao处理逻辑");
    }
}
