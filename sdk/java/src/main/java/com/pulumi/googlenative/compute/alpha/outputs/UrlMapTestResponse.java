// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.UrlMapTestHeaderResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class UrlMapTestResponse {
    /**
     * @return The weight to use for the supplied host and path when using advanced routing rules that involve traffic splitting.
     * 
     */
    private Integer backendServiceWeight;
    /**
     * @return Description of this test case.
     * 
     */
    private String description;
    /**
     * @return The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    private String expectedOutputUrl;
    /**
     * @return For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    private Integer expectedRedirectResponseCode;
    /**
     * @return The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead.
     * 
     * @deprecated
     * The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead.
     * 
     */
    @Deprecated /* The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead. */
    private String expectedUrlRedirect;
    /**
     * @return HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    private List<UrlMapTestHeaderResponse> headers;
    /**
     * @return Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    private String host;
    /**
     * @return Path portion of the URL.
     * 
     */
    private String path;
    /**
     * @return Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    private String service;

    private UrlMapTestResponse() {}
    /**
     * @return The weight to use for the supplied host and path when using advanced routing rules that involve traffic splitting.
     * 
     */
    public Integer backendServiceWeight() {
        return this.backendServiceWeight;
    }
    /**
     * @return Description of this test case.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The expected output URL evaluated by the load balancer containing the scheme, host, path and query parameters. For rules that forward requests to backends, the test passes only when expectedOutputUrl matches the request forwarded by the load balancer to backends. For rules with urlRewrite, the test verifies that the forwarded request matches hostRewrite and pathPrefixRewrite in the urlRewrite action. When service is specified, expectedOutputUrl`s scheme is ignored. For rules with urlRedirect, the test passes only if expectedOutputUrl matches the URL in the load balancer&#39;s redirect response. If urlRedirect specifies https_redirect, the test passes only if the scheme in expectedOutputUrl is also set to HTTPS. If urlRedirect specifies strip_query, the test passes only if expectedOutputUrl does not contain any query parameters. expectedOutputUrl is optional when service is specified.
     * 
     */
    public String expectedOutputUrl() {
        return this.expectedOutputUrl;
    }
    /**
     * @return For rules with urlRedirect, the test passes only if expectedRedirectResponseCode matches the HTTP status code in load balancer&#39;s redirect response. expectedRedirectResponseCode cannot be set when service is set.
     * 
     */
    public Integer expectedRedirectResponseCode() {
        return this.expectedRedirectResponseCode;
    }
    /**
     * @return The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead.
     * 
     * @deprecated
     * The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead.
     * 
     */
    @Deprecated /* The expected URL that should be redirected to for the host and path being tested. [Deprecated] This field is deprecated. Use expected_output_url instead. */
    public String expectedUrlRedirect() {
        return this.expectedUrlRedirect;
    }
    /**
     * @return HTTP headers for this request. If headers contains a host header, then host must also match the header value.
     * 
     */
    public List<UrlMapTestHeaderResponse> headers() {
        return this.headers;
    }
    /**
     * @return Host portion of the URL. If headers contains a host header, then host must also match the header value.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Path portion of the URL.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Expected BackendService or BackendBucket resource the given URL should be mapped to. The service field cannot be set if expectedRedirectResponseCode is set.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapTestResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backendServiceWeight;
        private String description;
        private String expectedOutputUrl;
        private Integer expectedRedirectResponseCode;
        private String expectedUrlRedirect;
        private List<UrlMapTestHeaderResponse> headers;
        private String host;
        private String path;
        private String service;
        public Builder() {}
        public Builder(UrlMapTestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendServiceWeight = defaults.backendServiceWeight;
    	      this.description = defaults.description;
    	      this.expectedOutputUrl = defaults.expectedOutputUrl;
    	      this.expectedRedirectResponseCode = defaults.expectedRedirectResponseCode;
    	      this.expectedUrlRedirect = defaults.expectedUrlRedirect;
    	      this.headers = defaults.headers;
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        @CustomType.Setter
        public Builder backendServiceWeight(Integer backendServiceWeight) {
            this.backendServiceWeight = Objects.requireNonNull(backendServiceWeight);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder expectedOutputUrl(String expectedOutputUrl) {
            this.expectedOutputUrl = Objects.requireNonNull(expectedOutputUrl);
            return this;
        }
        @CustomType.Setter
        public Builder expectedRedirectResponseCode(Integer expectedRedirectResponseCode) {
            this.expectedRedirectResponseCode = Objects.requireNonNull(expectedRedirectResponseCode);
            return this;
        }
        @CustomType.Setter
        public Builder expectedUrlRedirect(String expectedUrlRedirect) {
            this.expectedUrlRedirect = Objects.requireNonNull(expectedUrlRedirect);
            return this;
        }
        @CustomType.Setter
        public Builder headers(List<UrlMapTestHeaderResponse> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder headers(UrlMapTestHeaderResponse... headers) {
            return headers(List.of(headers));
        }
        @CustomType.Setter
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public UrlMapTestResponse build() {
            final var o = new UrlMapTestResponse();
            o.backendServiceWeight = backendServiceWeight;
            o.description = description;
            o.expectedOutputUrl = expectedOutputUrl;
            o.expectedRedirectResponseCode = expectedRedirectResponseCode;
            o.expectedUrlRedirect = expectedUrlRedirect;
            o.headers = headers;
            o.host = host;
            o.path = path;
            o.service = service;
            return o;
        }
    }
}