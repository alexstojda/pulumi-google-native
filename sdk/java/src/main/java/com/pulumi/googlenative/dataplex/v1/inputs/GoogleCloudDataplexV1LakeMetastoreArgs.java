// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings to manage association of Dataproc Metastore with a lake.
 * 
 */
public final class GoogleCloudDataplexV1LakeMetastoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDataplexV1LakeMetastoreArgs Empty = new GoogleCloudDataplexV1LakeMetastoreArgs();

    /**
     * Optional. A relative reference to the Dataproc Metastore (https://cloud.google.com/dataproc-metastore/docs) service associated with the lake: projects/{project_id}/locations/{location_id}/services/{service_id}
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Optional. A relative reference to the Dataproc Metastore (https://cloud.google.com/dataproc-metastore/docs) service associated with the lake: projects/{project_id}/locations/{location_id}/services/{service_id}
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    private GoogleCloudDataplexV1LakeMetastoreArgs() {}

    private GoogleCloudDataplexV1LakeMetastoreArgs(GoogleCloudDataplexV1LakeMetastoreArgs $) {
        this.service = $.service;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDataplexV1LakeMetastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDataplexV1LakeMetastoreArgs $;

        public Builder() {
            $ = new GoogleCloudDataplexV1LakeMetastoreArgs();
        }

        public Builder(GoogleCloudDataplexV1LakeMetastoreArgs defaults) {
            $ = new GoogleCloudDataplexV1LakeMetastoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param service Optional. A relative reference to the Dataproc Metastore (https://cloud.google.com/dataproc-metastore/docs) service associated with the lake: projects/{project_id}/locations/{location_id}/services/{service_id}
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Optional. A relative reference to the Dataproc Metastore (https://cloud.google.com/dataproc-metastore/docs) service associated with the lake: projects/{project_id}/locations/{location_id}/services/{service_id}
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        public GoogleCloudDataplexV1LakeMetastoreArgs build() {
            return $;
        }
    }

}