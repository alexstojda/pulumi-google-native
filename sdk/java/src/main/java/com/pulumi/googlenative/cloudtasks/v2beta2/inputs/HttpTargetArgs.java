// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks.v2beta2.enums.HttpTargetHttpMethod;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.HeaderOverrideArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.OAuthTokenArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.OidcTokenArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.UriOverrideArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HTTP target. When specified as a Queue, all the tasks with [HttpRequest] will be overridden according to the target.
 * 
 */
public final class HttpTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpTargetArgs Empty = new HttpTargetArgs();

    /**
     * HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with &#34;X-Google-Cloud-Tasks-&#34; will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
     * 
     */
    @Import(name="headerOverrides")
    private @Nullable Output<List<HeaderOverrideArgs>> headerOverrides;

    /**
     * @return HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with &#34;X-Google-Cloud-Tasks-&#34; will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
     * 
     */
    public Optional<Output<List<HeaderOverrideArgs>>> headerOverrides() {
        return Optional.ofNullable(this.headerOverrides);
    }

    /**
     * The HTTP method to use for the request. When specified, it will override HttpRequest for the task. Note that if the value is set to HttpMethod the HttpRequest of the task will be ignored at execution time.
     * 
     */
    @Import(name="httpMethod")
    private @Nullable Output<HttpTargetHttpMethod> httpMethod;

    /**
     * @return The HTTP method to use for the request. When specified, it will override HttpRequest for the task. Note that if the value is set to HttpMethod the HttpRequest of the task will be ignored at execution time.
     * 
     */
    public Optional<Output<HttpTargetHttpMethod>> httpMethod() {
        return Optional.ofNullable(this.httpMethod);
    }

    /**
     * If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    @Import(name="oauthToken")
    private @Nullable Output<OAuthTokenArgs> oauthToken;

    /**
     * @return If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
     * 
     */
    public Optional<Output<OAuthTokenArgs>> oauthToken() {
        return Optional.ofNullable(this.oauthToken);
    }

    /**
     * If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    @Import(name="oidcToken")
    private @Nullable Output<OidcTokenArgs> oidcToken;

    /**
     * @return If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
     * 
     */
    public Optional<Output<OidcTokenArgs>> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }

    /**
     * Uri override. When specified modifies the execution Uri for all the tasks in the queue.
     * 
     */
    @Import(name="uriOverride")
    private @Nullable Output<UriOverrideArgs> uriOverride;

    /**
     * @return Uri override. When specified modifies the execution Uri for all the tasks in the queue.
     * 
     */
    public Optional<Output<UriOverrideArgs>> uriOverride() {
        return Optional.ofNullable(this.uriOverride);
    }

    private HttpTargetArgs() {}

    private HttpTargetArgs(HttpTargetArgs $) {
        this.headerOverrides = $.headerOverrides;
        this.httpMethod = $.httpMethod;
        this.oauthToken = $.oauthToken;
        this.oidcToken = $.oidcToken;
        this.uriOverride = $.uriOverride;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpTargetArgs $;

        public Builder() {
            $ = new HttpTargetArgs();
        }

        public Builder(HttpTargetArgs defaults) {
            $ = new HttpTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headerOverrides HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with &#34;X-Google-Cloud-Tasks-&#34; will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
         * 
         * @return builder
         * 
         */
        public Builder headerOverrides(@Nullable Output<List<HeaderOverrideArgs>> headerOverrides) {
            $.headerOverrides = headerOverrides;
            return this;
        }

        /**
         * @param headerOverrides HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with &#34;X-Google-Cloud-Tasks-&#34; will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
         * 
         * @return builder
         * 
         */
        public Builder headerOverrides(List<HeaderOverrideArgs> headerOverrides) {
            return headerOverrides(Output.of(headerOverrides));
        }

        /**
         * @param headerOverrides HTTP target headers. This map contains the header field names and values. Headers will be set when running the task is created and/or task is created. These headers represent a subset of the headers that will accompany the task&#39;s HTTP request. Some HTTP request headers will be ignored or replaced. A partial list of headers that will be ignored or replaced is: * Any header that is prefixed with &#34;X-Google-Cloud-Tasks-&#34; will be treated as service header. Service headers define properties of the task and are predefined in CloudTask. * Host: This will be computed by Cloud Tasks and derived from HttpRequest.url. * Content-Length: This will be computed by Cloud Tasks. * User-Agent: This will be set to `&#34;Google-Cloud-Tasks&#34;`. * `X-Google-*`: Google use only. * `X-AppEngine-*`: Google use only. `Content-Type` won&#39;t be set by Cloud Tasks. You can explicitly set `Content-Type` to a media type when the task is created. For example, `Content-Type` can be set to `&#34;application/octet-stream&#34;` or `&#34;application/json&#34;`. Headers which can have multiple values (according to RFC2616) can be specified using comma-separated values. The size of the headers must be less than 80KB. Queue-level headers to override headers of all the tasks in the queue.
         * 
         * @return builder
         * 
         */
        public Builder headerOverrides(HeaderOverrideArgs... headerOverrides) {
            return headerOverrides(List.of(headerOverrides));
        }

        /**
         * @param httpMethod The HTTP method to use for the request. When specified, it will override HttpRequest for the task. Note that if the value is set to HttpMethod the HttpRequest of the task will be ignored at execution time.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(@Nullable Output<HttpTargetHttpMethod> httpMethod) {
            $.httpMethod = httpMethod;
            return this;
        }

        /**
         * @param httpMethod The HTTP method to use for the request. When specified, it will override HttpRequest for the task. Note that if the value is set to HttpMethod the HttpRequest of the task will be ignored at execution time.
         * 
         * @return builder
         * 
         */
        public Builder httpMethod(HttpTargetHttpMethod httpMethod) {
            return httpMethod(Output.of(httpMethod));
        }

        /**
         * @param oauthToken If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(@Nullable Output<OAuthTokenArgs> oauthToken) {
            $.oauthToken = oauthToken;
            return this;
        }

        /**
         * @param oauthToken If specified, an [OAuth token](https://developers.google.com/identity/protocols/OAuth2) will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization should generally only be used when calling Google APIs hosted on *.googleapis.com.
         * 
         * @return builder
         * 
         */
        public Builder oauthToken(OAuthTokenArgs oauthToken) {
            return oauthToken(Output.of(oauthToken));
        }

        /**
         * @param oidcToken If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(@Nullable Output<OidcTokenArgs> oidcToken) {
            $.oidcToken = oidcToken;
            return this;
        }

        /**
         * @param oidcToken If specified, an [OIDC](https://developers.google.com/identity/protocols/OpenIDConnect) token will be generated and attached as an `Authorization` header in the HTTP request. This type of authorization can be used for many scenarios, including calling Cloud Run, or endpoints where you intend to validate the token yourself.
         * 
         * @return builder
         * 
         */
        public Builder oidcToken(OidcTokenArgs oidcToken) {
            return oidcToken(Output.of(oidcToken));
        }

        /**
         * @param uriOverride Uri override. When specified modifies the execution Uri for all the tasks in the queue.
         * 
         * @return builder
         * 
         */
        public Builder uriOverride(@Nullable Output<UriOverrideArgs> uriOverride) {
            $.uriOverride = uriOverride;
            return this;
        }

        /**
         * @param uriOverride Uri override. When specified modifies the execution Uri for all the tasks in the queue.
         * 
         * @return builder
         * 
         */
        public Builder uriOverride(UriOverrideArgs uriOverride) {
            return uriOverride(Output.of(uriOverride));
        }

        public HttpTargetArgs build() {
            return $;
        }
    }

}