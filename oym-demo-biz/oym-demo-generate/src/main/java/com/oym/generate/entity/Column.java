package com.oym.generate.entity;

import com.oym.base.db.entity.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Column extends BaseEntity {
    //库名
    private String tableSchema;
    //表名
    private String tableName;
	//列名
    private String columnName;
    //列名类型
    private String dataType;
    //列名备注
    private String columnComment;
    //主键
    private String columnKey;

}
