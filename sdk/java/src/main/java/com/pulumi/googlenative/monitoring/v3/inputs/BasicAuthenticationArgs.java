// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The authentication parameters to provide to the specified resource or URL that requires a username and password. Currently, only Basic HTTP authentication (https://tools.ietf.org/html/rfc7617) is supported in Uptime checks.
 * 
 */
public final class BasicAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BasicAuthenticationArgs Empty = new BasicAuthenticationArgs();

    /**
     * The password to use when authenticating with the HTTP server.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password to use when authenticating with the HTTP server.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The username to use when authenticating with the HTTP server.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username to use when authenticating with the HTTP server.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private BasicAuthenticationArgs() {}

    private BasicAuthenticationArgs(BasicAuthenticationArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicAuthenticationArgs $;

        public Builder() {
            $ = new BasicAuthenticationArgs();
        }

        public Builder(BasicAuthenticationArgs defaults) {
            $ = new BasicAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param password The password to use when authenticating with the HTTP server.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password to use when authenticating with the HTTP server.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username The username to use when authenticating with the HTTP server.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to use when authenticating with the HTTP server.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public BasicAuthenticationArgs build() {
            return $;
        }
    }

}