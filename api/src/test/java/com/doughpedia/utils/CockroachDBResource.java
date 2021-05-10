package com.doughpedia.utils;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.CockroachContainer;
import java.util.Collections;
import java.util.Map;

public class CockroachDBResource implements QuarkusTestResourceLifecycleManager {

    static CockroachContainer db = new CockroachContainer("cockroachdb/cockroach:latest");
    @Override
    public Map<String, String> start() {
        db.start();
        return Collections.singletonMap("quarkus.datasource.url", db.getJdbcUrl());
    }

    @Override
    public void stop() {
        db.close();
    }
}
