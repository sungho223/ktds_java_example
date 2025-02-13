package com.ktdsuniversity.edu.file;

import java.io.File;
import java.util.Arrays;
import java.util.Date;

public class FileInfoExam {

	public static void printFileInfo(String directoryPath, String filename) {
		File file = null;
		if (filename == null) {
			file = new File(directoryPath);
		}
		else {
			file = new File(directoryPath, filename);
		}
		
		// 파일이 존재하냐?
		boolean exists = file.exists();
		System.out.println(filename + " exists: " + exists);
		
		// 파일이냐?
		boolean isFile = file.isFile();
		System.out.println(filename + " isFile: " + isFile);
		
		// 폴더냐?
		boolean isDirectory = file.isDirectory();
		System.out.println(filename + " isDirectory: " + isDirectory);
		
		// 전체경로는 뭐냐?
		String absolutePath = file.getAbsolutePath();
		System.out.println(filename + " absolutePath: " + absolutePath);
		
		// 파일의 이름은 뭐냐?
		String name = file.getName();
		System.out.println(filename + " name: " + name);
		
		// 파일의 크기는 얼마냐?
		/*
		 * 파일의 크기는 long 으로 받아온다.
		 * 이유는?
		 * 1 byte = 8bit;
		 * 1000 bytes = 1 KiB
		 * 1000 KiB = 1 MiB
		 * 1000 MiB = 1 GiB
		 * 1000 GiB = 1 TiB
		 * 1000 TiB = 1 PiB
		 * 
		 * 1 GiB = ? bytes.
		 */
		long length = file.length();
		System.out.println(filename + " length: " + length + "bytes");
		
		// 파일이 언제 만들어졌냐? => 지금은 모른다.
		
		// 파일이 언제 마지막으로 수정됐냐?
		// 날짜와 시간을 long으로 주는 이유.
		// 컴퓨터가 날짜와 시간을 처리하는 방법.
		//   기준(1970-01-01 00:00:00.000)으로 부터 몇 밀리초(1초 / 1000)가 지났는지 계산.
		long lastModified = file.lastModified();
		System.out.println(filename + " lastModified: " + lastModified + "ms");
		// 밀리초를 날짜형식으로 변경.
		Date lastModifiedDate = new Date(lastModified); // java.util.Date
		System.out.println(filename + " lastModified: " + lastModifiedDate);
		
		// 이 파일의 부모 폴더는 누구인가?
		// 이 파일이 어디에 있냐?
		String parentDirectoryPath = file.getParent();
		System.out.println(filename + " parent: " + parentDirectoryPath);
		
		// file 객체가 폴더였을 때, 폴더 내부에 있는 항목은 뭐냐?
		File[] listFiles = file.listFiles();
		System.out.println(filename + " listFiles: " + Arrays.toString(listFiles) );
		
		System.out.println("=".repeat(40));
	}
	
	/*
	 * 탐색을 시작하고 싶은 폴더를 주면
	 * 하위에 존재하는 모오오오오오든 폴더와 파일들의 목록을 출력한다.
	 */
	public static void traversingAndPrintFileInfo(String startDirectoryPath) {
		// startDirectoryPath 경로의 File 인스턴스( file ) 를 생성.
		File file = new File(startDirectoryPath);
		// file이 존재한다면
		if (file.exists()) {
			System.out.println(file.getAbsolutePath() + "(" + file.length() + ")");
			// file이 폴더라면
			if (file.isDirectory()) {
				// file의 자식 요소(폴더+파일)들을 얻어온다.
				File[] listFiles = file.listFiles();
				// file의 자식 요소(폴더+파일)을 반복한다.
				for (File child : listFiles) {
					// traversingAndPrintFileInfo(자식요소의 전체경로);
					traversingAndPrintFileInfo(child.getAbsolutePath());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		traversingAndPrintFileInfo("/Users/codemakers/Desktop/fileexam");
		
//		printFileInfo("/Users/codemakers/Desktop/fileexam", "company.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam", "example.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam", "sample.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder1", "sub_company.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder1", "sub_example.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder1", "sub_sample.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_sample.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder1/subfolder1-1", "sub1-1_example.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam/subfolder2", "sub_sample.txt");
//		printFileInfo("/Users/codemakers/Desktop/fileexam", null);
	}
	
}