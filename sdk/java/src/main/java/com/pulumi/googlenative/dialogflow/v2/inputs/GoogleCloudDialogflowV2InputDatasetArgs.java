// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * InputDataset used to create model or do evaluation. NextID:5
 * 
 */
public final class GoogleCloudDialogflowV2InputDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2InputDatasetArgs Empty = new GoogleCloudDialogflowV2InputDatasetArgs();

    /**
     * ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
     * 
     */
    @Import(name="dataset", required=true)
    private Output<String> dataset;

    /**
     * @return ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
     * 
     */
    public Output<String> dataset() {
        return this.dataset;
    }

    private GoogleCloudDialogflowV2InputDatasetArgs() {}

    private GoogleCloudDialogflowV2InputDatasetArgs(GoogleCloudDialogflowV2InputDatasetArgs $) {
        this.dataset = $.dataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2InputDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2InputDatasetArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2InputDatasetArgs();
        }

        public Builder(GoogleCloudDialogflowV2InputDatasetArgs defaults) {
            $ = new GoogleCloudDialogflowV2InputDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataset ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
         * 
         * @return builder
         * 
         */
        public Builder dataset(Output<String> dataset) {
            $.dataset = dataset;
            return this;
        }

        /**
         * @param dataset ConversationDataset resource name. Format: `projects//locations//conversationDatasets/`
         * 
         * @return builder
         * 
         */
        public Builder dataset(String dataset) {
            return dataset(Output.of(dataset));
        }

        public GoogleCloudDialogflowV2InputDatasetArgs build() {
            $.dataset = Objects.requireNonNull($.dataset, "expected parameter 'dataset' to be non-null");
            return $;
        }
    }

}