package com.cw.springbootprovider.server;

import com.alibaba.dubbo.common.utils.NamedThreadFactory;

/**
 * Copyright (C), 2019,
 * FileName: Test
 * Author:   CW
 * Date:     2019/9/23 10:08
 * Description: demo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 * <p>
 * package com.liusxg.springbootprovider.server;
 * /**
 * 〈一句话功能简述〉<br>
 * 〈demo〉
 *
 * @author Administrator
 * @create 2019/9/23
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        NamedThreadFactory threadFactory = new NamedThreadFactory();
        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {

            }
        });

        threadFactory.newThread(new Runnable() {
            @Override
            public void run() {

            }
        });

        System.out.println(threadFactory);
    }
}