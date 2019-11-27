package com.test.springcore.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanFactoryPostProcessorClass implements BeanFactoryPostProcessor{

    public void postProcessBeanFactory(ConfigurableListableBeanFactory bf)
            throws BeansException {
        System.out.println("*****it is bean factory Post Processror*****");
        boolean iscontainhelloworld=bf.containsBean("helloWorld");
        System.out.println(" is contain hello world is : "+iscontainhelloworld+"*********");
        
    }

}
