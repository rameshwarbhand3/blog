package com.example.SpringAndAwsS3.service;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StorageServiceTest {
    @Test
    public void testUpload(){
        StorageService storageService = new StorageService();
        storageService.upload(new File("/home/pranjal/Desktop/workspace/aws/s3/s3-storage-service/demo/HELP.md"));

    }
    @Test
    public void testDownload() throws IOException {
        StorageService storageService = new StorageService();
        storageService.download("myfile.md");
    }

}