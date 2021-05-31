package cn.coonu.starter.minio;

import io.minio.*;
import io.minio.errors.*;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class MinioTest {

    @Test
    public void test1() {

//        FileUploader.uploadFile();
    }

    @Test
    public void test2() throws Exception {

        MinioClient client = MinioClient.builder()
                .credentials("Q3AM3UQ867SPQQA43P2F", "zuf+tfteSlswRu7BJ86wekitnifILbZam1KYY3TG")
                .endpoint("http://play.minio.io")
                .build();

        String bucketName = "0000china";

//        client.makeBucket(MakeBucketArgs.builder().bucket("0000china").build());




//        InputStream in = new FileInputStream("D:/其他/desktopBackground/1.jpg");
//        PutObjectArgs args = PutObjectArgs.builder()
//                .bucket(bucketName)
//                .stream(in, in.available(), -1)
//                .object("background.jpg")
//                .build();
//        ObjectWriteResponse response = client.putObject(args);


        GetObjectArgs args1 = GetObjectArgs.builder()
                .bucket(bucketName)
                .object("background.jpg")
                .build();
        GetObjectResponse response = client.getObject(args1);


        response.close();






    }





























}
