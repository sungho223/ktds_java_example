package com.ktdsuniversity.edu.fp.basic;

/**
 * 함수로 대체될 인터페이스
 */
@FunctionalInterface // 함수로 사용할 수 있는 인터페이스를 명시
					 // 제약사항: 반다시 1개의 추상 메소드만 존재
public interface YesOrNo {

	public boolean test(int value);

}
