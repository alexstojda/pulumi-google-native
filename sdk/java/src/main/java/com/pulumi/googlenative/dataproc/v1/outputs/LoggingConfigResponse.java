// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class LoggingConfigResponse {
    /**
     * @return The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    private Map<String,String> driverLogLevels;

    private LoggingConfigResponse() {}
    /**
     * @return The per-package log levels for the driver. This may include &#34;root&#34; package name to configure rootLogger. Examples: &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache = DEBUG&#39;
     * 
     */
    public Map<String,String> driverLogLevels() {
        return this.driverLogLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> driverLogLevels;
        public Builder() {}
        public Builder(LoggingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverLogLevels = defaults.driverLogLevels;
        }

        @CustomType.Setter
        public Builder driverLogLevels(Map<String,String> driverLogLevels) {
            this.driverLogLevels = Objects.requireNonNull(driverLogLevels);
            return this;
        }
        public LoggingConfigResponse build() {
            final var o = new LoggingConfigResponse();
            o.driverLogLevels = driverLogLevels;
            return o;
        }
    }
}