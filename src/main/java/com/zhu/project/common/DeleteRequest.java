package com.zhu.project.common;
import java.io.Serializable;
import lombok.Data;

/**
 * 根据id删除请求
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;


}