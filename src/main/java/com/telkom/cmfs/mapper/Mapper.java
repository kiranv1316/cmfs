package com.telkom.cmfs.mapper;

import static com.telkom.cmfs.util.Constants.GET;
import static com.telkom.cmfs.util.Constants.LOG_PREFIX;
import static com.telkom.cmfs.util.Constants.MAPPER_PREFIX;
import static com.telkom.cmfs.util.Constants.SET;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mapper<S, D> {

	Logger logger = LoggerFactory.getLogger(Mapper.class);

	public D map(S s, D d) {

		Method[] allSourceMethods = s.getClass().getDeclaredMethods();

		Map<String, Method> mapOfDestinationMethod = getMapOfMethod(d);
		Map<String, Method> mapOfTransformMethod = getMapOfMethod(this);

		for (Method sourceMethod : allSourceMethods) {
			String fullMethodName = sourceMethod.getName();

			if (null != fullMethodName && fullMethodName.length() >= 1 && fullMethodName.startsWith(GET)) {

				String methodName = fullMethodName.substring(GET.length());
				methodName = Character.toUpperCase(methodName.charAt(0)) + methodName.substring(1);
				try {

					Class<?> type = sourceMethod.getReturnType();
					Object inputValue = sourceMethod.invoke(s);

					Class<?>[] paramTypes = null;

					if (mapOfDestinationMethod.size() >= 1 && null != mapOfDestinationMethod.get(SET + methodName)) {
						Method destMethod = mapOfDestinationMethod.get(SET + methodName);
						if (mapOfTransformMethod.size() >= 1
								&& null != mapOfTransformMethod.get(MAPPER_PREFIX + methodName)) {
							Method transformerMethod = this.getClass().getMethod(MAPPER_PREFIX + methodName, type);
							Object transformedValue = transformerMethod.invoke(this, inputValue);
							destMethod.invoke(d, transformedValue);
						} else {
							destMethod.invoke(d, inputValue);
						}
					}

				} catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
					logger.error(LOG_PREFIX, methodName);
				}

			}
		}

		return d;
	}

	private Map<String, Method> getMapOfMethod(Object o) {
		Map<String, Method> mapOfMethod = new HashMap<>();
		Method[] allDestinationMethods = o.getClass().getDeclaredMethods();
		for (Method destMethod : allDestinationMethods) {
			mapOfMethod.put(destMethod.getName(), destMethod);
		}
		return mapOfMethod;
	}

}
