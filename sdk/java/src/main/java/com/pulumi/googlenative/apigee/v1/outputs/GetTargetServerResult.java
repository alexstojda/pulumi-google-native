// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigee.v1.outputs.GoogleCloudApigeeV1TlsInfoResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTargetServerResult {
    /**
     * @return Optional. A human-readable description of this TargetServer.
     * 
     */
    private String description;
    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    private String host;
    /**
     * @return Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    private Boolean isEnabled;
    /**
     * @return The resource id of this target server. Values must match the regular expression
     * 
     */
    private String name;
    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    private Integer port;
    /**
     * @return Immutable. The protocol used by this TargetServer.
     * 
     */
    private String protocol;
    /**
     * @return Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    private GoogleCloudApigeeV1TlsInfoResponse sSLInfo;

    private GetTargetServerResult() {}
    /**
     * @return Optional. A human-readable description of this TargetServer.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return The resource id of this target server. Values must match the regular expression
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Immutable. The protocol used by this TargetServer.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    public GoogleCloudApigeeV1TlsInfoResponse sSLInfo() {
        return this.sSLInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetServerResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String host;
        private Boolean isEnabled;
        private String name;
        private Integer port;
        private String protocol;
        private GoogleCloudApigeeV1TlsInfoResponse sSLInfo;
        public Builder() {}
        public Builder(GetTargetServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.host = defaults.host;
    	      this.isEnabled = defaults.isEnabled;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.sSLInfo = defaults.sSLInfo;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder sSLInfo(GoogleCloudApigeeV1TlsInfoResponse sSLInfo) {
            this.sSLInfo = Objects.requireNonNull(sSLInfo);
            return this;
        }
        public GetTargetServerResult build() {
            final var o = new GetTargetServerResult();
            o.description = description;
            o.host = host;
            o.isEnabled = isEnabled;
            o.name = name;
            o.port = port;
            o.protocol = protocol;
            o.sSLInfo = sSLInfo;
            return o;
        }
    }
}