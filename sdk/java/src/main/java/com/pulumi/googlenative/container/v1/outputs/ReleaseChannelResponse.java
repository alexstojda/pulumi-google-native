// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ReleaseChannelResponse {
    /**
     * @return channel specifies which release channel the cluster is subscribed to.
     * 
     */
    private String channel;

    private ReleaseChannelResponse() {}
    /**
     * @return channel specifies which release channel the cluster is subscribed to.
     * 
     */
    public String channel() {
        return this.channel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReleaseChannelResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        public Builder() {}
        public Builder(ReleaseChannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public ReleaseChannelResponse build() {
            final var o = new ReleaseChannelResponse();
            o.channel = channel;
            return o;
        }
    }
}