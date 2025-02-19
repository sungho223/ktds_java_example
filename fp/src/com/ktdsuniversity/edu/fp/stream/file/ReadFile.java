package com.ktdsuniversity.edu.fp.stream.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * 파일의 내용을 읽어서 스트림 처리를 진행
 */
public class ReadFile {
	private final String FILE_PATH = "C:\\Users\\User\\Desktop\\streamExam";
	private final String FILE_NAME = "text.txt";

	public void printFileDescription() {
		
		Stream<String> fileStream = null;
		
		try {
			fileStream = Files.lines(new File(this.FILE_PATH, this.FILE_NAME).toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(fileStream != null) {
			fileStream.filter(line -> line.length() > 0)
					  .map(line -> line.replace("\t", " "))
					  .map(line -> line.replaceAll("(KBS1|KBS2|SBS|MBC|tvN)", ""))
					  .map(line -> line.trim())
					  .filter(line -> line.length() < 50)
					  .filter(line -> !line.endsWith(" MC상"))
					  .forEach(System.out::println)
					  ;
		}
	}

	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		rf.printFileDescription();
	}

}
