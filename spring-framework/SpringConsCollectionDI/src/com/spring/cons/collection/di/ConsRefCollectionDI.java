package com.spring.cons.collection.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConsRefCollectionDI {

	private List<ReferenceList> langList;
	private Set<ReferenceSet> keys;
	private Map<ReferenceKeyMap, ReferenceValueMap> resultMap;

	public ConsRefCollectionDI(List<ReferenceList> langList, Set<ReferenceSet> keys,
			Map<ReferenceKeyMap, ReferenceValueMap> resultMap) {
		super();
		this.langList = langList;
		this.keys = keys;
		this.resultMap = resultMap;
	}

	public void displayData() {
		System.out.println("<---- List of languages using reference bean ---->");
		langList.forEach(lang -> System.out.println(lang));
		System.out.println("<---- Set of keys using reference bean ---->");
		keys.stream().forEach(System.out::println);
		System.out.println("<---- Map of keys and values using reference bean ---->");
		resultMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}

}
