// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.servicemanagement.v1.inputs.JwtLocationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for an authentication provider, including support for [JSON Web Token (JWT)](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32).
 * 
 */
public final class AuthProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthProviderArgs Empty = new AuthProviderArgs();

    /**
     * The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - &#34;https://[service.name]/[google.protobuf.Api.name]&#34; - &#34;https://[service.name]/&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<String> audiences;

    /**
     * @return The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - &#34;https://[service.name]/[google.protobuf.Api.name]&#34; - &#34;https://[service.name]/&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    public Optional<Output<String>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    @Import(name="authorizationUrl")
    private @Nullable Output<String> authorizationUrl;

    /**
     * @return Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
     * 
     */
    public Optional<Output<String>> authorizationUrl() {
        return Optional.ofNullable(this.authorizationUrl);
    }

    /**
     * The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: &#34;bookstore_auth&#34;.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: &#34;bookstore_auth&#34;.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * URL of the provider&#39;s public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    @Import(name="jwksUri")
    private @Nullable Output<String> jwksUri;

    /**
     * @return URL of the provider&#39;s public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
     * 
     */
    public Optional<Output<String>> jwksUri() {
        return Optional.ofNullable(this.jwksUri);
    }

    /**
     * Defines the locations to extract the JWT. For now it is only used by the Cloud Endpoints to store the OpenAPI extension [x-google-jwt-locations] (https://cloud.google.com/endpoints/docs/openapi/openapi-extensions#x-google-jwt-locations) JWT locations can be one of HTTP headers, URL query parameters or cookies. The rule is that the first match wins. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: &#34;Bearer &#34; - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    @Import(name="jwtLocations")
    private @Nullable Output<List<JwtLocationArgs>> jwtLocations;

    /**
     * @return Defines the locations to extract the JWT. For now it is only used by the Cloud Endpoints to store the OpenAPI extension [x-google-jwt-locations] (https://cloud.google.com/endpoints/docs/openapi/openapi-extensions#x-google-jwt-locations) JWT locations can be one of HTTP headers, URL query parameters or cookies. The rule is that the first match wins. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: &#34;Bearer &#34; - header: x-goog-iap-jwt-assertion - query: access_token
     * 
     */
    public Optional<Output<List<JwtLocationArgs>>> jwtLocations() {
        return Optional.ofNullable(this.jwtLocations);
    }

    private AuthProviderArgs() {}

    private AuthProviderArgs(AuthProviderArgs $) {
        this.audiences = $.audiences;
        this.authorizationUrl = $.authorizationUrl;
        this.id = $.id;
        this.issuer = $.issuer;
        this.jwksUri = $.jwksUri;
        this.jwtLocations = $.jwtLocations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthProviderArgs $;

        public Builder() {
            $ = new AuthProviderArgs();
        }

        public Builder(AuthProviderArgs defaults) {
            $ = new AuthProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audiences The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - &#34;https://[service.name]/[google.protobuf.Api.name]&#34; - &#34;https://[service.name]/&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<String> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences The list of JWT [audiences](https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.3). that are allowed to access. A JWT containing any of these audiences will be accepted. When this setting is absent, JWTs with audiences: - &#34;https://[service.name]/[google.protobuf.Api.name]&#34; - &#34;https://[service.name]/&#34; will be accepted. For example, if no audiences are in the setting, LibraryService API will accept JWTs with the following audiences: - https://library-example.googleapis.com/google.example.library.v1.LibraryService - https://library-example.googleapis.com/ Example: audiences: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(String audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param authorizationUrl Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
         * 
         * @return builder
         * 
         */
        public Builder authorizationUrl(@Nullable Output<String> authorizationUrl) {
            $.authorizationUrl = authorizationUrl;
            return this;
        }

        /**
         * @param authorizationUrl Redirect URL if JWT token is required but not present or is expired. Implement authorizationUrl of securityDefinitions in OpenAPI spec.
         * 
         * @return builder
         * 
         */
        public Builder authorizationUrl(String authorizationUrl) {
            return authorizationUrl(Output.of(authorizationUrl));
        }

        /**
         * @param id The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: &#34;bookstore_auth&#34;.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The unique identifier of the auth provider. It will be referred to by `AuthRequirement.provider_id`. Example: &#34;bookstore_auth&#34;.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param issuer Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer Identifies the principal that issued the JWT. See https://tools.ietf.org/html/draft-ietf-oauth-json-web-token-32#section-4.1.1 Usually a URL or an email address. Example: https://securetoken.google.com Example: 1234567-compute@developer.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param jwksUri URL of the provider&#39;s public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
         * 
         * @return builder
         * 
         */
        public Builder jwksUri(@Nullable Output<String> jwksUri) {
            $.jwksUri = jwksUri;
            return this;
        }

        /**
         * @param jwksUri URL of the provider&#39;s public key set to validate signature of the JWT. See [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html#ProviderMetadata). Optional if the key set document: - can be retrieved from [OpenID Discovery](https://openid.net/specs/openid-connect-discovery-1_0.html) of the issuer. - can be inferred from the email domain of the issuer (e.g. a Google service account). Example: https://www.googleapis.com/oauth2/v1/certs
         * 
         * @return builder
         * 
         */
        public Builder jwksUri(String jwksUri) {
            return jwksUri(Output.of(jwksUri));
        }

        /**
         * @param jwtLocations Defines the locations to extract the JWT. For now it is only used by the Cloud Endpoints to store the OpenAPI extension [x-google-jwt-locations] (https://cloud.google.com/endpoints/docs/openapi/openapi-extensions#x-google-jwt-locations) JWT locations can be one of HTTP headers, URL query parameters or cookies. The rule is that the first match wins. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: &#34;Bearer &#34; - header: x-goog-iap-jwt-assertion - query: access_token
         * 
         * @return builder
         * 
         */
        public Builder jwtLocations(@Nullable Output<List<JwtLocationArgs>> jwtLocations) {
            $.jwtLocations = jwtLocations;
            return this;
        }

        /**
         * @param jwtLocations Defines the locations to extract the JWT. For now it is only used by the Cloud Endpoints to store the OpenAPI extension [x-google-jwt-locations] (https://cloud.google.com/endpoints/docs/openapi/openapi-extensions#x-google-jwt-locations) JWT locations can be one of HTTP headers, URL query parameters or cookies. The rule is that the first match wins. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: &#34;Bearer &#34; - header: x-goog-iap-jwt-assertion - query: access_token
         * 
         * @return builder
         * 
         */
        public Builder jwtLocations(List<JwtLocationArgs> jwtLocations) {
            return jwtLocations(Output.of(jwtLocations));
        }

        /**
         * @param jwtLocations Defines the locations to extract the JWT. For now it is only used by the Cloud Endpoints to store the OpenAPI extension [x-google-jwt-locations] (https://cloud.google.com/endpoints/docs/openapi/openapi-extensions#x-google-jwt-locations) JWT locations can be one of HTTP headers, URL query parameters or cookies. The rule is that the first match wins. If not specified, default to use following 3 locations: 1) Authorization: Bearer 2) x-goog-iap-jwt-assertion 3) access_token query parameter Default locations can be specified as followings: jwt_locations: - header: Authorization value_prefix: &#34;Bearer &#34; - header: x-goog-iap-jwt-assertion - query: access_token
         * 
         * @return builder
         * 
         */
        public Builder jwtLocations(JwtLocationArgs... jwtLocations) {
            return jwtLocations(List.of(jwtLocations));
        }

        public AuthProviderArgs build() {
            return $;
        }
    }

}