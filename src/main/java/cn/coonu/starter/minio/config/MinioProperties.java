package cn.coonu.starter.minio.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "coonu.minio")
public class MinioProperties {

    /**
     * 用户ID;
     */
    private String accessKey;

    /**
     * 用户密码;
     */
    private String secretKey;

    /**
     * 服务器地址;
     * 如果不是80, 需要加上端口;
     * 允许的配置方式:
     * https://play.min.io
     * https://play.min.io:9000
     * localhost
     * play.min.io
     */
    private String endpoint;

    private Map<String, String> buckets;

}
