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
package jp.xet.sparwings.spring.data.exceptions;

import lombok.NoArgsConstructor;

/**
 * 不正な Sliceable を渡した時の Exception
 */
@NoArgsConstructor
@SuppressWarnings("serial")
public class InvalidSliceableException extends RuntimeException {
	
	/**
	 * インスタンスを生成する。
	 *
	 * @param message 例外メッセージ
	 * @param cause 起因例外
	 */
	public InvalidSliceableException(String message, Throwable cause) {
		super(message, cause);
	}
	
	/**
	 * インスタンスを生成する。
	 *
	 * @param message 例外メッセージ
	 */
	public InvalidSliceableException(String message) {
		super(message);
	}
	
	/**
	 * インスタンスを生成する。
	 *
	 * @param cause 起因例外
	 */
	public InvalidSliceableException(Throwable cause) {
		super(cause);
	}
}
