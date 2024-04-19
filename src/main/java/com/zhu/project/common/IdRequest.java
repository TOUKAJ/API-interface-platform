package com.zhu.project.common;
import lombok.Data;
import java.io.Serializable;

/**
 * 前端传id，查询修改等
 */
@Data
public class IdRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}