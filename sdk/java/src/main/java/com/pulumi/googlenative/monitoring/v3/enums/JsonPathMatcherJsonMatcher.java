// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The type of JSONPath match that will be applied to the JSON output (ContentMatcher.content)
     * 
     */
    @EnumType
    public enum JsonPathMatcherJsonMatcher {
        /**
         * No JSONPath matcher type specified (not valid).
         * 
         */
        JsonPathMatcherOptionUnspecified("JSON_PATH_MATCHER_OPTION_UNSPECIFIED"),
        /**
         * Selects &#39;exact string&#39; matching. The match succeeds if the content at the json_path within the output is exactly the same as the content string.
         * 
         */
        ExactMatch("EXACT_MATCH"),
        /**
         * Selects regular-expression matching. The match succeeds if the content at the json_path within the output matches the regular expression specified in the content string.
         * 
         */
        RegexMatch("REGEX_MATCH");

        private final String value;

        JsonPathMatcherJsonMatcher(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "JsonPathMatcherJsonMatcher[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }