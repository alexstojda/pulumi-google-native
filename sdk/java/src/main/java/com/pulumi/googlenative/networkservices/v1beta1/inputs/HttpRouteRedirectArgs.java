// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.networkservices.v1beta1.enums.HttpRouteRedirectResponseCode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification for redirecting traffic.
 * 
 */
public final class HttpRouteRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteRedirectArgs Empty = new HttpRouteRedirectArgs();

    /**
     * The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    @Import(name="hostRedirect")
    private @Nullable Output<String> hostRedirect;

    /**
     * @return The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    public Optional<Output<String>> hostRedirect() {
        return Optional.ofNullable(this.hostRedirect);
    }

    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
     * 
     */
    @Import(name="httpsRedirect")
    private @Nullable Output<Boolean> httpsRedirect;

    /**
     * @return If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
     * 
     */
    public Optional<Output<Boolean>> httpsRedirect() {
        return Optional.ofNullable(this.httpsRedirect);
    }

    /**
     * The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    @Import(name="pathRedirect")
    private @Nullable Output<String> pathRedirect;

    /**
     * @return The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    public Optional<Output<String>> pathRedirect() {
        return Optional.ofNullable(this.pathRedirect);
    }

    /**
     * The port that will be used in the redirected request instead of the one that was supplied in the request.
     * 
     */
    @Import(name="portRedirect")
    private @Nullable Output<Integer> portRedirect;

    /**
     * @return The port that will be used in the redirected request instead of the one that was supplied in the request.
     * 
     */
    public Optional<Output<Integer>> portRedirect() {
        return Optional.ofNullable(this.portRedirect);
    }

    /**
     * Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
     * 
     */
    @Import(name="prefixRewrite")
    private @Nullable Output<String> prefixRewrite;

    /**
     * @return Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
     * 
     */
    public Optional<Output<String>> prefixRewrite() {
        return Optional.ofNullable(this.prefixRewrite);
    }

    /**
     * The HTTP Status code to use for the redirect.
     * 
     */
    @Import(name="responseCode")
    private @Nullable Output<HttpRouteRedirectResponseCode> responseCode;

    /**
     * @return The HTTP Status code to use for the redirect.
     * 
     */
    public Optional<Output<HttpRouteRedirectResponseCode>> responseCode() {
        return Optional.ofNullable(this.responseCode);
    }

    /**
     * if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    @Import(name="stripQuery")
    private @Nullable Output<Boolean> stripQuery;

    /**
     * @return if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    public Optional<Output<Boolean>> stripQuery() {
        return Optional.ofNullable(this.stripQuery);
    }

    private HttpRouteRedirectArgs() {}

    private HttpRouteRedirectArgs(HttpRouteRedirectArgs $) {
        this.hostRedirect = $.hostRedirect;
        this.httpsRedirect = $.httpsRedirect;
        this.pathRedirect = $.pathRedirect;
        this.portRedirect = $.portRedirect;
        this.prefixRewrite = $.prefixRewrite;
        this.responseCode = $.responseCode;
        this.stripQuery = $.stripQuery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteRedirectArgs $;

        public Builder() {
            $ = new HttpRouteRedirectArgs();
        }

        public Builder(HttpRouteRedirectArgs defaults) {
            $ = new HttpRouteRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostRedirect The host that will be used in the redirect response instead of the one that was supplied in the request.
         * 
         * @return builder
         * 
         */
        public Builder hostRedirect(@Nullable Output<String> hostRedirect) {
            $.hostRedirect = hostRedirect;
            return this;
        }

        /**
         * @param hostRedirect The host that will be used in the redirect response instead of the one that was supplied in the request.
         * 
         * @return builder
         * 
         */
        public Builder hostRedirect(String hostRedirect) {
            return hostRedirect(Output.of(hostRedirect));
        }

        /**
         * @param httpsRedirect If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder httpsRedirect(@Nullable Output<Boolean> httpsRedirect) {
            $.httpsRedirect = httpsRedirect;
            return this;
        }

        /**
         * @param httpsRedirect If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder httpsRedirect(Boolean httpsRedirect) {
            return httpsRedirect(Output.of(httpsRedirect));
        }

        /**
         * @param pathRedirect The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
         * 
         * @return builder
         * 
         */
        public Builder pathRedirect(@Nullable Output<String> pathRedirect) {
            $.pathRedirect = pathRedirect;
            return this;
        }

        /**
         * @param pathRedirect The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
         * 
         * @return builder
         * 
         */
        public Builder pathRedirect(String pathRedirect) {
            return pathRedirect(Output.of(pathRedirect));
        }

        /**
         * @param portRedirect The port that will be used in the redirected request instead of the one that was supplied in the request.
         * 
         * @return builder
         * 
         */
        public Builder portRedirect(@Nullable Output<Integer> portRedirect) {
            $.portRedirect = portRedirect;
            return this;
        }

        /**
         * @param portRedirect The port that will be used in the redirected request instead of the one that was supplied in the request.
         * 
         * @return builder
         * 
         */
        public Builder portRedirect(Integer portRedirect) {
            return portRedirect(Output.of(portRedirect));
        }

        /**
         * @param prefixRewrite Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
         * 
         * @return builder
         * 
         */
        public Builder prefixRewrite(@Nullable Output<String> prefixRewrite) {
            $.prefixRewrite = prefixRewrite;
            return this;
        }

        /**
         * @param prefixRewrite Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
         * 
         * @return builder
         * 
         */
        public Builder prefixRewrite(String prefixRewrite) {
            return prefixRewrite(Output.of(prefixRewrite));
        }

        /**
         * @param responseCode The HTTP Status code to use for the redirect.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(@Nullable Output<HttpRouteRedirectResponseCode> responseCode) {
            $.responseCode = responseCode;
            return this;
        }

        /**
         * @param responseCode The HTTP Status code to use for the redirect.
         * 
         * @return builder
         * 
         */
        public Builder responseCode(HttpRouteRedirectResponseCode responseCode) {
            return responseCode(Output.of(responseCode));
        }

        /**
         * @param stripQuery if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder stripQuery(@Nullable Output<Boolean> stripQuery) {
            $.stripQuery = stripQuery;
            return this;
        }

        /**
         * @param stripQuery if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
         * 
         * @return builder
         * 
         */
        public Builder stripQuery(Boolean stripQuery) {
            return stripQuery(Output.of(stripQuery));
        }

        public HttpRouteRedirectArgs build() {
            return $;
        }
    }

}