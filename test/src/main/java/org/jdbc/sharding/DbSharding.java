package org.jdbc.sharding;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DbSharding implements HintShardingAlgorithm<Long> {

    private Map<Long,String> shopDb = new HashMap<>();

    {
        shopDb.put(81477L,"test0");
        shopDb.put(17173L,"test1");
    }

    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames,
                                         final HintShardingValue<Long> shardingValue) {
        Collection<String> result = new ArrayList<>();
        result.add(shopDb.get(shardingValue.getValues().toArray()[0]));
        return result;
    }
}