// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpRouteRedirectResponse {
    /**
     * @return The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    private String hostRedirect;
    /**
     * @return If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
     * 
     */
    private Boolean httpsRedirect;
    /**
     * @return The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    private String pathRedirect;
    /**
     * @return The port that will be used in the redirected request instead of the one that was supplied in the request.
     * 
     */
    private Integer portRedirect;
    /**
     * @return Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
     * 
     */
    private String prefixRewrite;
    /**
     * @return The HTTP Status code to use for the redirect.
     * 
     */
    private String responseCode;
    /**
     * @return if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    private Boolean stripQuery;

    private HttpRouteRedirectResponse() {}
    /**
     * @return The host that will be used in the redirect response instead of the one that was supplied in the request.
     * 
     */
    public String hostRedirect() {
        return this.hostRedirect;
    }
    /**
     * @return If set to true, the URL scheme in the redirected request is set to https. If set to false, the URL scheme of the redirected request will remain the same as that of the request. The default is set to false.
     * 
     */
    public Boolean httpsRedirect() {
        return this.httpsRedirect;
    }
    /**
     * @return The path that will be used in the redirect response instead of the one that was supplied in the request. path_redirect can not be supplied together with prefix_redirect. Supply one alone or neither. If neither is supplied, the path of the original request will be used for the redirect.
     * 
     */
    public String pathRedirect() {
        return this.pathRedirect;
    }
    /**
     * @return The port that will be used in the redirected request instead of the one that was supplied in the request.
     * 
     */
    public Integer portRedirect() {
        return this.portRedirect;
    }
    /**
     * @return Indicates that during redirection, the matched prefix (or path) should be swapped with this value. This option allows URLs be dynamically created based on the request.
     * 
     */
    public String prefixRewrite() {
        return this.prefixRewrite;
    }
    /**
     * @return The HTTP Status code to use for the redirect.
     * 
     */
    public String responseCode() {
        return this.responseCode;
    }
    /**
     * @return if set to true, any accompanying query portion of the original URL is removed prior to redirecting the request. If set to false, the query portion of the original URL is retained. The default is set to false.
     * 
     */
    public Boolean stripQuery() {
        return this.stripQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteRedirectResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostRedirect;
        private Boolean httpsRedirect;
        private String pathRedirect;
        private Integer portRedirect;
        private String prefixRewrite;
        private String responseCode;
        private Boolean stripQuery;
        public Builder() {}
        public Builder(HttpRouteRedirectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.portRedirect = defaults.portRedirect;
    	      this.prefixRewrite = defaults.prefixRewrite;
    	      this.responseCode = defaults.responseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        @CustomType.Setter
        public Builder hostRedirect(String hostRedirect) {
            this.hostRedirect = Objects.requireNonNull(hostRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder httpsRedirect(Boolean httpsRedirect) {
            this.httpsRedirect = Objects.requireNonNull(httpsRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder pathRedirect(String pathRedirect) {
            this.pathRedirect = Objects.requireNonNull(pathRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder portRedirect(Integer portRedirect) {
            this.portRedirect = Objects.requireNonNull(portRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder prefixRewrite(String prefixRewrite) {
            this.prefixRewrite = Objects.requireNonNull(prefixRewrite);
            return this;
        }
        @CustomType.Setter
        public Builder responseCode(String responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }
        @CustomType.Setter
        public Builder stripQuery(Boolean stripQuery) {
            this.stripQuery = Objects.requireNonNull(stripQuery);
            return this;
        }
        public HttpRouteRedirectResponse build() {
            final var o = new HttpRouteRedirectResponse();
            o.hostRedirect = hostRedirect;
            o.httpsRedirect = httpsRedirect;
            o.pathRedirect = pathRedirect;
            o.portRedirect = portRedirect;
            o.prefixRewrite = prefixRewrite;
            o.responseCode = responseCode;
            o.stripQuery = stripQuery;
            return o;
        }
    }
}