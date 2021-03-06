/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.xet.sparwings.spring.env;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.Assert;

/**
 * システム環境（spring profile）を判定するサービスクラス。
 * 
 * @since 0.3
 * @author daisuke
 */
public class EnvironmentService {
	
	@Autowired
	Environment env;
	
	
	/**
	 * 指定したspring profileが現在アクティブかどうかを返す。
	 * 
	 * @param profileName spring profile名
	 * @return アクティブな場合は{@code true}、そうでない場合は{@code false}
	 * @throws NullPointerException 引数に{@code null}を与えた場合
	 * @since 0.3
	 */
	public boolean is(String profileName) {
		Assert.notNull(profileName, "The profile name is must not be null.");
		return Arrays.asList(env.getActiveProfiles()).contains(profileName);
	}
	
	/**
	 * 現在アクティブなspring profileをカンマ区切り文字列で返す。
	 * 
	 * @return 現在アクティブなspring profile
	 * @since 0.3
	 */
	public String getActiveProfilesAsString() {
		return Arrays.stream(env.getActiveProfiles()).collect(Collectors.joining(","));
	}
	
	@Override
	public String toString() {
		return env.toString();
	}
}
