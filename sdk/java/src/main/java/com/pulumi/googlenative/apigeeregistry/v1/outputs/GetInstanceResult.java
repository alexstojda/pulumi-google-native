// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigeeregistry.v1.outputs.ConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * @return Config of the Instance.
     * 
     */
    private ConfigResponse config;
    /**
     * @return Creation timestamp.
     * 
     */
    private String createTime;
    /**
     * @return Format: `projects/*{@literal /}locations/*{@literal /}instance`. Currently only locations/global is supported.
     * 
     */
    private String name;
    /**
     * @return The current state of the Instance.
     * 
     */
    private String state;
    /**
     * @return Extra information of Instance.State if the state is `FAILED`.
     * 
     */
    private String stateMessage;
    /**
     * @return Last update timestamp.
     * 
     */
    private String updateTime;

    private GetInstanceResult() {}
    /**
     * @return Config of the Instance.
     * 
     */
    public ConfigResponse config() {
        return this.config;
    }
    /**
     * @return Creation timestamp.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Format: `projects/*{@literal /}locations/*{@literal /}instance`. Currently only locations/global is supported.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The current state of the Instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Extra information of Instance.State if the state is `FAILED`.
     * 
     */
    public String stateMessage() {
        return this.stateMessage;
    }
    /**
     * @return Last update timestamp.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ConfigResponse config;
        private String createTime;
        private String name;
        private String state;
        private String stateMessage;
        private String updateTime;
        public Builder() {}
        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder config(ConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = Objects.requireNonNull(stateMessage);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetInstanceResult build() {
            final var o = new GetInstanceResult();
            o.config = config;
            o.createTime = createTime;
            o.name = name;
            o.state = state;
            o.stateMessage = stateMessage;
            o.updateTime = updateTime;
            return o;
        }
    }
}