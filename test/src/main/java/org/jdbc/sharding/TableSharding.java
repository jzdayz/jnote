package org.jdbc.sharding;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class TableSharding implements HintShardingAlgorithm<Date> {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<Date> shardingValue) {
        Date date = (Date) shardingValue.getValues().toArray()[0];
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        String logicTableName = shardingValue.getLogicTableName();
        Collection<String> tables = new ArrayList<>();
        int monthValue = localDateTime.getMonthValue();
        tables.add(logicTableName+"_"+localDateTime.getYear()+"_"+ (monthValue<10?"0"+monthValue : monthValue));
        return tables;
    }
}