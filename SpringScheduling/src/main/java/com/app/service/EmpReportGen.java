package com.app.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmpReportGen {

	@Scheduled(fixedRate=5000)
	@Scheduled(fixedDelay=5000)
	@Scheduled(cron="0 0 0 1 1 ?")
	public void genRepo()
	{
		System.out.println("Hello: "+new Date());
	}
}
