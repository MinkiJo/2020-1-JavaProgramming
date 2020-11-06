package main;

public class TooOldException extends Exception{
	TooOldException(){
		super("나이를 200 이상 혹은 0 이하로 설정한 예외");
	}
}
