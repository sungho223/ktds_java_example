package com.ktdsuniversity.edu.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.file.data.Product;

public class FileWriteExam {
    public static void fileWriteUseNewIo(String directoryPath, String filename, List<String> data) {
        File writeFile = new File(directoryPath, filename);
        
        // 1. 새로 작성할 파일 인스턴스 만들기
        // 2. 파일을 만든 위치가 존재하는지 확인
        if (!writeFile.getParentFile().exists()) {
            writeFile.getParentFile().mkdirs(); // 디렉토리 생성
        }

        // 3. 파일이 이미 존재하는지 확인하고, 존재하면 파일명에 숫자 추가
        int index = 1;
        while (writeFile.exists()) {
            String newFileName = filename.substring(0, filename.lastIndexOf(".")); // 확장자 제외한 파일명
            newFileName += " (" + (index++) + ")"; // 번호 붙이기

            newFileName += filename.substring(filename.lastIndexOf(".")); // 확장자 추가
            writeFile = new File(directoryPath, newFileName); // 새 파일 경로로 설정
        }

        // 4. 파일 쓰기
        try {
            Files.write(writeFile.toPath(), data); // 파일에 데이터 쓰기
            System.out.println("파일이 생성되었습니다: " + writeFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileWriteUseOldIO(String directoryPath, String filename, List<String> data ) {
        // 이 부분은 작성되지 않음
    }

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add(new Product("스마트폰1", 10000, 100).toFileFormat());
        data.add(new Product("스마트폰2", 20000, 200).toFileFormat());
        data.add(new Product("스마트폰3", 30000, 300).toFileFormat());
        data.add(new Product("스마트폰4", 40000, 400).toFileFormat());
        data.add(new Product("스마트폰5", 50000, 500).toFileFormat());

        fileWriteUseNewIo("C:\\Users\\User\\Desktop\\fileExam\\Store", "storeProduct.txt", data);
    }
}
