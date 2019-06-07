package com.pes.jd.model.DO;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("user")
public class UserDO extends Model<UserDO> {
    private Integer id;
    private String name;
    @Version
    private Integer version;
}
