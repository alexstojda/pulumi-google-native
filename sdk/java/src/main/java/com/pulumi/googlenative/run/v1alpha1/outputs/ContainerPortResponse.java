// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerPortResponse {
    /**
     * @return (Optional) Port number the container listens on. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
     */
    private Integer containerPort;
    /**
     * @return (Optional) If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; and &#34;h2c&#34;.
     * 
     */
    private String name;
    /**
     * @return (Optional) Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
     */
    private String protocol;

    private ContainerPortResponse() {}
    /**
     * @return (Optional) Port number the container listens on. This must be a valid port number, 0 &lt; x &lt; 65536.
     * 
     */
    public Integer containerPort() {
        return this.containerPort;
    }
    /**
     * @return (Optional) If specified, used to specify which protocol to use. Allowed values are &#34;http1&#34; and &#34;h2c&#34;.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return (Optional) Protocol for port. Must be &#34;TCP&#34;. Defaults to &#34;TCP&#34;.
     * 
     */
    public String protocol() {
        return this.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer containerPort;
        private String name;
        private String protocol;
        public Builder() {}
        public Builder(ContainerPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
        }

        @CustomType.Setter
        public Builder containerPort(Integer containerPort) {
            this.containerPort = Objects.requireNonNull(containerPort);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public ContainerPortResponse build() {
            final var o = new ContainerPortResponse();
            o.containerPort = containerPort;
            o.name = name;
            o.protocol = protocol;
            return o;
        }
    }
}