/** 
 * PROJECT  : 재능기부 프로젝트
 * NAME  :  NotExistException.java
 * DESC  :  중복예외 처리용 사용자 정의 예외 클래스
 * 
 * @author  
 * @version 1.0
*/

package dailyfashion.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class DuplicateException extends Exception {

	public DuplicateException() {
	}

	public DuplicateException(String message) {
		super(message);
		log.warn(message);
	}
}
