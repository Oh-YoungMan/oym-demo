package com.oym.activiti.dao;

import com.oym.activiti.entity.ColumnInfo;
import com.oym.base.db.dao.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangyd
 * @date 2019/9/27 8:36
 * @desc
 */
@Repository
public interface ColumnsDao extends BaseDao {

    /**
     * 根据dbName和tableName查找字段名
     *
     * @param db    数据库名
     * @param table 表名
     * @return 字段名
     */
    List<ColumnInfo> selectTableInfoByDbAndTable(@Param("db") String db, @Param("table") String table);
}
