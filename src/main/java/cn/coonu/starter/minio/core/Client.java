package cn.coonu.starter.minio.core;

import cn.coonu.starter.minio.config.MinioProperties;
import io.minio.MinioClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    /*--------------------------------------------
	|             C O N S T A N T S             |
	============================================*/

    private final static Logger LOG = LoggerFactory.getLogger(Client.class);

    /*--------------------------------------------
	|    I N S T A N C E   V A R I A B L E S    |
	============================================*/

    private final MinioClient minioClient;

    private final MinioProperties properties;

    /*--------------------------------------------
	|         C O N S T R U C T O R S           |
	============================================*/

    public Client(MinioClient minioClient, MinioProperties properties) {
        this.minioClient = minioClient;
        this.properties = properties;
    }

    /*--------------------------------------------
	|               M E T H O D S               |
	============================================*/

    //以下就是以下上传, 下载, 查询等等方法;

    public void method() {

    }


}
