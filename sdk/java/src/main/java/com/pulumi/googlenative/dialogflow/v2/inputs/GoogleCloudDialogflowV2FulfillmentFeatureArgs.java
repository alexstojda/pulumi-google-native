// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2.enums.GoogleCloudDialogflowV2FulfillmentFeatureType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Whether fulfillment is enabled for the specific feature.
 * 
 */
public final class GoogleCloudDialogflowV2FulfillmentFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2FulfillmentFeatureArgs Empty = new GoogleCloudDialogflowV2FulfillmentFeatureArgs();

    /**
     * The type of the feature that enabled for fulfillment.
     * 
     */
    @Import(name="type")
    private @Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type;

    /**
     * @return The type of the feature that enabled for fulfillment.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2FulfillmentFeatureType>> type() {
        return Optional.ofNullable(this.type);
    }

    private GoogleCloudDialogflowV2FulfillmentFeatureArgs() {}

    private GoogleCloudDialogflowV2FulfillmentFeatureArgs(GoogleCloudDialogflowV2FulfillmentFeatureArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2FulfillmentFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2FulfillmentFeatureArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2FulfillmentFeatureArgs();
        }

        public Builder(GoogleCloudDialogflowV2FulfillmentFeatureArgs defaults) {
            $ = new GoogleCloudDialogflowV2FulfillmentFeatureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The type of the feature that enabled for fulfillment.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<GoogleCloudDialogflowV2FulfillmentFeatureType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the feature that enabled for fulfillment.
         * 
         * @return builder
         * 
         */
        public Builder type(GoogleCloudDialogflowV2FulfillmentFeatureType type) {
            return type(Output.of(type));
        }

        public GoogleCloudDialogflowV2FulfillmentFeatureArgs build() {
            return $;
        }
    }

}