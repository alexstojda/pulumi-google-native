// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is used for defining User Defined Function (UDF) resources only when using legacy SQL. Users of Standard SQL should leverage either DDL (e.g. CREATE [TEMPORARY] FUNCTION ... ) or the Routines API to define UDF resources. For additional information on migrating, see: https://cloud.google.com/bigquery/docs/reference/standard-sql/migrating-from-legacy-sql#differences_in_user-defined_javascript_functions
 * 
 */
public final class UserDefinedFunctionResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserDefinedFunctionResourceArgs Empty = new UserDefinedFunctionResourceArgs();

    /**
     * [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    @Import(name="inlineCode")
    private @Nullable Output<String> inlineCode;

    /**
     * @return [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
     * 
     */
    public Optional<Output<String>> inlineCode() {
        return Optional.ofNullable(this.inlineCode);
    }

    /**
     * [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    @Import(name="resourceUri")
    private @Nullable Output<String> resourceUri;

    /**
     * @return [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
     * 
     */
    public Optional<Output<String>> resourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    private UserDefinedFunctionResourceArgs() {}

    private UserDefinedFunctionResourceArgs(UserDefinedFunctionResourceArgs $) {
        this.inlineCode = $.inlineCode;
        this.resourceUri = $.resourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDefinedFunctionResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDefinedFunctionResourceArgs $;

        public Builder() {
            $ = new UserDefinedFunctionResourceArgs();
        }

        public Builder(UserDefinedFunctionResourceArgs defaults) {
            $ = new UserDefinedFunctionResourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inlineCode [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
         * 
         * @return builder
         * 
         */
        public Builder inlineCode(@Nullable Output<String> inlineCode) {
            $.inlineCode = inlineCode;
            return this;
        }

        /**
         * @param inlineCode [Pick one] An inline resource that contains code for a user-defined function (UDF). Providing a inline code resource is equivalent to providing a URI for a file containing the same code.
         * 
         * @return builder
         * 
         */
        public Builder inlineCode(String inlineCode) {
            return inlineCode(Output.of(inlineCode));
        }

        /**
         * @param resourceUri [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(@Nullable Output<String> resourceUri) {
            $.resourceUri = resourceUri;
            return this;
        }

        /**
         * @param resourceUri [Pick one] A code resource to load from a Google Cloud Storage URI (gs://bucket/path).
         * 
         * @return builder
         * 
         */
        public Builder resourceUri(String resourceUri) {
            return resourceUri(Output.of(resourceUri));
        }

        public UserDefinedFunctionResourceArgs build() {
            return $;
        }
    }

}