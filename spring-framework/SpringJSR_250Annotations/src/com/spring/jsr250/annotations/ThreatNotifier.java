package com.spring.jsr250.annotations;

import javax.annotation.Resource;

public class ThreatNotifier {

	private IocCollector iocCollector;
	private String iocType;

	/*
	 * The @Resource annotation takes a 'name' attribute which will be interpreted
	 * as the bean name to be injected. it follows by-name autowiring semantics
	 */
	/*
	 * If no 'name' is specified explicitly, the default name is derived from the
	 * field name or setter method. In case of a field, it takes the field name; in
	 * case of a setter method, it takes the bean property name.
	 */
	@Resource(name = "setIocCollector")
	public void setIocCollector(IocCollector collector) {
		this.iocCollector = collector;
	}

	public IocCollector getIocCollector() {
		return iocCollector;
	}

	public void getIocType() {
		System.out.println("IoC Type : " + iocType);
	}

	public void setIocType(String iocType) {
		this.iocType = iocType;
	}

	public void notifyThreat() {
		iocCollector.collectIoc();
	}
}
