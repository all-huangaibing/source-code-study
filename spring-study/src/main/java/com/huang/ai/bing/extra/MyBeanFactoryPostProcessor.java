package com.huang.ai.bing.extra;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
/**
 * ���ܣ�
 *
 * @author huangaibing
 * @date 2019/10/10 16:52
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {


    public MyBeanFactoryPostProcessor() {
        System.out.println("���� MyBeanFactoryPostProcessor ");
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...postProcessBeanFactory...");
		int count = beanFactory.getBeanDefinitionCount();
		String[] names = beanFactory.getBeanDefinitionNames();
		System.out.println("��ǰBeanFactory����"+count+" ��Bean");
		System.out.println(Arrays.asList(names));
    }
}
