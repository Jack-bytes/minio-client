package cn.coonu.starter.minio;

import io.minio.*;
import io.minio.errors.*;
import io.minio.messages.Bucket;
import io.minio.messages.NotificationConfiguration;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class FileUploader {

    private static final MinioClient CLIENT;

    static {
        CLIENT = MinioClient.builder()
                .endpoint("http://192.168.87.135:9000")
                .credentials("***", "***")
                .build();
    }

    public static void uploadFile()
            throws IOException, InvalidKeyException, InvalidResponseException,
            InsufficientDataException, NoSuchAlgorithmException, ServerException,
            InternalException, XmlParserException, ErrorResponseException {
        NotificationConfiguration configuration = CLIENT.getBucketNotification(GetBucketNotificationArgs.builder().bucket("img").build());
        boolean isExist = CLIENT.bucketExists(BucketExistsArgs.builder().bucket("img").build());
        ObjectWriteResponse img = CLIENT.uploadObject(UploadObjectArgs.builder().bucket("img").object("test.jpg").filename("D:/其他/desktopBackground/2.png").build());
        //client.listObjects();
        List<Bucket> buckets = CLIENT.listBuckets();
    }
}
