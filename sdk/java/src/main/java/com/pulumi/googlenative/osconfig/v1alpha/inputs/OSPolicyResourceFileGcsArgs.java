// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a file available as a Cloud Storage Object.
 * 
 */
public final class OSPolicyResourceFileGcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileGcsArgs Empty = new OSPolicyResourceFileGcsArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Bucket of the Cloud Storage object.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return Generation number of the Cloud Storage object.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return Name of the Cloud Storage object.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private OSPolicyResourceFileGcsArgs() {}

    private OSPolicyResourceFileGcsArgs(OSPolicyResourceFileGcsArgs $) {
        this.bucket = $.bucket;
        this.generation = $.generation;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceFileGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceFileGcsArgs $;

        public Builder() {
            $ = new OSPolicyResourceFileGcsArgs();
        }

        public Builder(OSPolicyResourceFileGcsArgs defaults) {
            $ = new OSPolicyResourceFileGcsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param generation Generation number of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation Generation number of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param object Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public OSPolicyResourceFileGcsArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}