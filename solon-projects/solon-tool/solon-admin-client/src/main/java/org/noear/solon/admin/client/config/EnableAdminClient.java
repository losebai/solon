package org.noear.solon.admin.client.config;

import org.noear.solon.annotation.Import;

import java.lang.annotation.*;

/**
 * 指示此服务作为 solon-admin 客户端，此注解一般用在启动类上。
 *
 * @author shaokeyibb
 * @since 2.3
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnableAdminClient {
}
