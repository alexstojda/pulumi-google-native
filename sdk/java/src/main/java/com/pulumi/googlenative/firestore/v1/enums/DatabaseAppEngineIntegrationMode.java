// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firestore.v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The App Engine integration mode to use for this database.
     * 
     */
    @EnumType
    public enum DatabaseAppEngineIntegrationMode {
        /**
         * Not used.
         * 
         */
        AppEngineIntegrationModeUnspecified("APP_ENGINE_INTEGRATION_MODE_UNSPECIFIED"),
        /**
         * If an App Engine application exists in the same region as this database, App Engine configuration will impact this database. This includes disabling of the application &amp; database, as well as disabling writes to the database.
         * 
         */
        Enabled("ENABLED"),
        /**
         * Appengine has no affect on the ability of this database to serve requests.
         * 
         */
        Disabled("DISABLED");

        private final String value;

        DatabaseAppEngineIntegrationMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DatabaseAppEngineIntegrationMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }