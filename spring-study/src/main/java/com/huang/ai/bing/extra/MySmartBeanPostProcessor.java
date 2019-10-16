package com.huang.ai.bing.extra;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

/**
 * 后置处理器：初始化前后进行处理工作
 * 将后置处理器加入到容器中
 * @author lfy
 */
//@Component
public class MySmartBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		return new Constructor[0];
	}

	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		return null;
	}

	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}

	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		return null;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}
}