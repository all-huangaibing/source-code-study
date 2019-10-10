package com.huang.ai.bing.config;


import com.huang.ai.bing.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//������==�����ļ�
@Configuration  //����Spring����һ��������

//@ComponentScans(
//		value = {
//				@ComponentScan(value="com.huang.ai.bing",includeFilters = {
///*						@Filter(type=FilterType.ANNOTATION,classes={Controller.class}),
//						@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={BookService.class}),*/
////						@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})
//				},useDefaultFilters = false)
//		}
//		)
@ComponentScan("com.huang.ai.bing")
//excludeFilters = Filter[] ��ָ��ɨ���ʱ����ʲô�����ų���Щ���
//includeFilters = Filter[] ��ָ��ɨ���ʱ��ֻ��Ҫ������Щ���
//FilterType.ANNOTATION������ע��
//FilterType.ASSIGNABLE_TYPE�����ո��������ͣ�
//FilterType.ASPECTJ��ʹ��ASPECTJ���ʽ
//FilterType.REGEX��ʹ������ָ��
//FilterType.CUSTOM��ʹ���Զ������
public class MainConfig {
	
	//��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("person")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
