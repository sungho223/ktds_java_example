package com.ktdsuniversity.edu.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

public class FileReadExam {

	public static void fileReadUseNewIo(String directoryPath, String filename) {

//		File targetFile = new File(directoryPath, filename);
		File targetFile = new File("C:\\Users\\User\\Desktop\\fileExam", "product.txt");

		List<Product> product = new ArrayList<Product>();

		try {
			List<String> arr = Files.readAllLines(targetFile.toPath());
			for (String str : arr) {
//				System.out.println(str);

				product.add(new Product(str.split(",")));
			}
		} catch (IOException e) {
			System.out.println("파일을 읽어오는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + e.getMessage());

		}
		for (Product eachProduct : product) {
			System.out.println(eachProduct);
		}

	}

	public static void fileReadUseOldIO(String directoryPath, String filename) {
		// 읽어오려는 파일의 객체를 만든다. -> targetFile
//		File targetFile = new File("C:\\Users\\User\\Desktop\\fileExam\\FileIOExam", "readSample.txt");
		File targetFile = new File(directoryPath, filename);
		if (!targetFile.exists() || !targetFile.isFile()) {
			return;
		}

		// Note. 파일의 내용을 단위 바이트로 읽는다.
		// 영어, 숫자, 특수문자 : 1byte "abc"
		// 그 외 나머지 외국어 : 3byte "한글"

		// Note. 내부에서 FileReader를 이용해 한줄 자체를 통으로 읽음
		// 캐리지리턴(\n) 이 나올 때 까지 바이트를 계속 읽는다.

		// 파일을 읽기 위한 FileReader 객체를 만든다 -> fileReader
		FileReader fileReader = null;
		// 파일을 한 줄 씩 읽기 위한 BufferedReader 객체를 만든다 -> bufferedReader
		BufferedReader br = null;

		try {
			fileReader = new FileReader(targetFile);
			// 파일을 한 줄 씩 읽기 위한 BufferedReader 객체를 만든다 -> bufferedReader
			br = new BufferedReader(fileReader);

			String line = null;

			// bufferedReader를 통해서 EOF 까지 한줄 씩 읽는다.
			while ((line = br.readLine()) != null) {
				// 한줄씩 출력한다.
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println(targetFile.getName() + " 파일이 존재하지 않습니다.");
			return;
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일을 읽는 중에 에러가 발생했습니다.");
			System.out.println("원인: " + e.getMessage());
			return;
		} finally {
			// 파이프를 닫는다. (오픈의 역순)
			// bufferedReader를 닫는다
			// fileReader를 닫는다.
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
				}
			}

			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (Exception e) {
				}
			}

		}
	}

	public static void main(String[] args) {
//		fileReadUseNewIo("lkjyuhkuhk", "aslkdjfl9eij");
//		fileReadUseOldIO("C:\\Users\\User\\Desktop\\fileExam\\FileIOExam", "readSample.txt");
		fileReadUseNewIo("C:\\Users\\User\\Desktop\\fileExam", "product.txt");
	}

}
