// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.enums.TargetServerProtocol;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1TlsInfoArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetServerArgs Empty = new TargetServerArgs();

    /**
     * Optional. A human-readable description of this TargetServer.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A human-readable description of this TargetServer.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    @Import(name="host", required=true)
    private Output<String> host;

    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    public Output<String> host() {
        return this.host;
    }

    /**
     * Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    @Import(name="isEnabled")
    private @Nullable Output<Boolean> isEnabled;

    /**
     * @return Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> isEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    /**
     * The resource id of this target server. Values must match the regular expression
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The resource id of this target server. Values must match the regular expression
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Immutable. The protocol used by this TargetServer.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<TargetServerProtocol> protocol;

    /**
     * @return Immutable. The protocol used by this TargetServer.
     * 
     */
    public Optional<Output<TargetServerProtocol>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    @Import(name="sSLInfo")
    private @Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo;

    /**
     * @return Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1TlsInfoArgs>> sSLInfo() {
        return Optional.ofNullable(this.sSLInfo);
    }

    private TargetServerArgs() {}

    private TargetServerArgs(TargetServerArgs $) {
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.host = $.host;
        this.isEnabled = $.isEnabled;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.port = $.port;
        this.protocol = $.protocol;
        this.sSLInfo = $.sSLInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetServerArgs $;

        public Builder() {
            $ = new TargetServerArgs();
        }

        public Builder(TargetServerArgs defaults) {
            $ = new TargetServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. A human-readable description of this TargetServer.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A human-readable description of this TargetServer.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param host The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
         * 
         * @return builder
         * 
         */
        public Builder host(Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param isEnabled Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        /**
         * @param isEnabled Optional. Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        /**
         * @param name The resource id of this target server. Values must match the regular expression
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The resource id of this target server. Values must match the regular expression
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param port The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol Immutable. The protocol used by this TargetServer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<TargetServerProtocol> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol Immutable. The protocol used by this TargetServer.
         * 
         * @return builder
         * 
         */
        public Builder protocol(TargetServerProtocol protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param sSLInfo Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
         * 
         * @return builder
         * 
         */
        public Builder sSLInfo(@Nullable Output<GoogleCloudApigeeV1TlsInfoArgs> sSLInfo) {
            $.sSLInfo = sSLInfo;
            return this;
        }

        /**
         * @param sSLInfo Optional. Specifies TLS configuration info for this TargetServer. The JSON name is `sSLInfo` for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
         * 
         * @return builder
         * 
         */
        public Builder sSLInfo(GoogleCloudApigeeV1TlsInfoArgs sSLInfo) {
            return sSLInfo(Output.of(sSLInfo));
        }

        public TargetServerArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.host = Objects.requireNonNull($.host, "expected parameter 'host' to be non-null");
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}