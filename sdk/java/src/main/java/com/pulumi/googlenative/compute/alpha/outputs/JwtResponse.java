// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.JwtHeaderResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JwtResponse {
    /**
     * @return A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    private List<String> audiences;
    /**
     * @return Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
     * 
     */
    private String issuer;
    /**
     * @return The provider&#39;s public key set to validate the signature of the JWT.
     * 
     */
    private String jwksPublicKeys;
    /**
     * @return jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
     * 
     */
    private List<JwtHeaderResponse> jwtHeaders;
    /**
     * @return This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
     * 
     */
    private List<String> jwtParams;

    private JwtResponse() {}
    /**
     * @return A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    public List<String> audiences() {
        return this.audiences;
    }
    /**
     * @return Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
     * 
     */
    public String issuer() {
        return this.issuer;
    }
    /**
     * @return The provider&#39;s public key set to validate the signature of the JWT.
     * 
     */
    public String jwksPublicKeys() {
        return this.jwksPublicKeys;
    }
    /**
     * @return jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
     * 
     */
    public List<JwtHeaderResponse> jwtHeaders() {
        return this.jwtHeaders;
    }
    /**
     * @return This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
     * 
     */
    public List<String> jwtParams() {
        return this.jwtParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> audiences;
        private String issuer;
        private String jwksPublicKeys;
        private List<JwtHeaderResponse> jwtHeaders;
        private List<String> jwtParams;
        public Builder() {}
        public Builder(JwtResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.issuer = defaults.issuer;
    	      this.jwksPublicKeys = defaults.jwksPublicKeys;
    	      this.jwtHeaders = defaults.jwtHeaders;
    	      this.jwtParams = defaults.jwtParams;
        }

        @CustomType.Setter
        public Builder audiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        @CustomType.Setter
        public Builder jwksPublicKeys(String jwksPublicKeys) {
            this.jwksPublicKeys = Objects.requireNonNull(jwksPublicKeys);
            return this;
        }
        @CustomType.Setter
        public Builder jwtHeaders(List<JwtHeaderResponse> jwtHeaders) {
            this.jwtHeaders = Objects.requireNonNull(jwtHeaders);
            return this;
        }
        public Builder jwtHeaders(JwtHeaderResponse... jwtHeaders) {
            return jwtHeaders(List.of(jwtHeaders));
        }
        @CustomType.Setter
        public Builder jwtParams(List<String> jwtParams) {
            this.jwtParams = Objects.requireNonNull(jwtParams);
            return this;
        }
        public Builder jwtParams(String... jwtParams) {
            return jwtParams(List.of(jwtParams));
        }
        public JwtResponse build() {
            final var o = new JwtResponse();
            o.audiences = audiences;
            o.issuer = issuer;
            o.jwksPublicKeys = jwksPublicKeys;
            o.jwtHeaders = jwtHeaders;
            o.jwtParams = jwtParams;
            return o;
        }
    }
}