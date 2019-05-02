package com.pes.jd.model.DO;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    @Version
    private Integer version;
}
