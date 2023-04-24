package com.siddhu.camunda;

import org.camunda.bpm.client.spring.annotation.ExternalTaskSubscription;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.springframework.context.annotation.Configuration;


@Configuration
@ExternalTaskSubscription("siddhutopic") 
public class EligibilityHandler implements ExternalTaskHandler {

	@Override
	public void execute(ExternalTask extTask, ExternalTaskService extTaskService) {

		String name = extTask.getVariable("name");
		long age = extTask.getVariable("age");


		System.out.println("name"+name);
		System.out.println("age"+age);
	}

}
