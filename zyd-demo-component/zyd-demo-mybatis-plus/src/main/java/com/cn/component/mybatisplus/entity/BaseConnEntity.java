package com.cn.component.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author zyd
 * @date 2019/10/18 11:43
 * @desc 默认的只有关系连接的实体类 AB表关联类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public abstract class BaseConnEntity implements BaseEntity {

    // 主键
    @TableId(value = ID, type = IdType.AUTO)
    protected Long id;

    @Override
    public void create() {
        this.id = null;
    }

}
