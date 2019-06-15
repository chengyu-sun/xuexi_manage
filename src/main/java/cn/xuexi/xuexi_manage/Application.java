package cn.xuexi.xuexi_manage;

import cn.xuexi.core.Xuexi_network;

public class Application{
    public static void main(String[] args) {
        // manage-api.xuexi.cn 入口
        String login_src="http://manage-api.xuexi.cn/";
        String proxy_src="host=vpn.xuexi.cn&username=chengyu-sun&password=chengyu@123";

        Xuexi_network connect = Xuexi_network.connect(proxy_src);
        System.out.println(connect.get(login_src));
    }
}