// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * Required. Query Engine to be used for the Sql Query.
     * 
     */
    @EnumType
    public enum GoogleCloudDataplexV1ContentSqlScriptEngine {
        /**
         * Value was unspecified.
         * 
         */
        QueryEngineUnspecified("QUERY_ENGINE_UNSPECIFIED"),
        /**
         * Spark SQL Query.
         * 
         */
        Spark("SPARK");

        private final String value;

        GoogleCloudDataplexV1ContentSqlScriptEngine(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "GoogleCloudDataplexV1ContentSqlScriptEngine[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }