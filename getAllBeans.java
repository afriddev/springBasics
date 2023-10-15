package spring;

import java.util.Arrays;
public class getAllBeans{
public static void main(String [] args){
  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
}
}
