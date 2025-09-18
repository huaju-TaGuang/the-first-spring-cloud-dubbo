package com.huaju.model.entity;

import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.KeyType;
import com.mybatisflex.annotation.Table;
import com.mybatisflex.core.keygen.KeyGenerators;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.crypto.KeyGenerator;
import java.io.Serial;
import java.io.Serializable;

/**
 * 应用 实体类
 *
 * @author huaju
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("app")
public class App implements Serializable {

    @Serial
    private static  final long serialVersionUID = 1L;

    /**
     * id
     *
     * @author huaju
     */
    @Id(keyType = KeyType.Generator, value = KeyGenerators.snowFlakeId)
    private Long id;

    /**
     * 应用名称
     *
     * @author huaju
     */
    @Column("appName")
    private String appName;

}
