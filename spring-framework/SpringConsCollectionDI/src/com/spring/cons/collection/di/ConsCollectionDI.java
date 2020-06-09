package com.spring.cons.collection.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ConsCollectionDI {

	private List<String> langList;
	private Set<String> keys;
	private Map<String, Object> resultMap;
	private Properties props;

	public ConsCollectionDI(List<String> langList, Set<String> keys, Map<String, Object> resultMap, Properties props) {
		super();
		this.langList = langList;
		this.keys = keys;
		this.resultMap = resultMap;
		this.props = props;
	}

	public void displayData() {
		System.out.println("<---- List of languages ---->");
		langList.forEach(lang -> System.out.println(lang));
		System.out.println("<---- Set of keys using ---->");
		keys.stream().forEach(System.out::println);
		System.out.println("<---- Map of keys and values ---->");
		resultMap.forEach((k, v) -> System.out.println(k + ": " + v));
		System.out.println("<---- Properties of keys and values ---->");
		props.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
