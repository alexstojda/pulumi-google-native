// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2.enums.GoogleCloudDialogflowV2IntentMessageMediaContentMediaType;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The media content card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageMediaContentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageMediaContentArgs Empty = new GoogleCloudDialogflowV2IntentMessageMediaContentArgs();

    /**
     * List of media objects.
     * 
     */
    @Import(name="mediaObjects", required=true)
    private Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects;

    /**
     * @return List of media objects.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects() {
        return this.mediaObjects;
    }

    /**
     * Optional. What type of media is the content (ie &#34;audio&#34;).
     * 
     */
    @Import(name="mediaType")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType;

    /**
     * @return Optional. What type of media is the content (ie &#34;audio&#34;).
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType>> mediaType() {
        return Optional.ofNullable(this.mediaType);
    }

    private GoogleCloudDialogflowV2IntentMessageMediaContentArgs() {}

    private GoogleCloudDialogflowV2IntentMessageMediaContentArgs(GoogleCloudDialogflowV2IntentMessageMediaContentArgs $) {
        this.mediaObjects = $.mediaObjects;
        this.mediaType = $.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageMediaContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageMediaContentArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageMediaContentArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageMediaContentArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageMediaContentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mediaObjects List of media objects.
         * 
         * @return builder
         * 
         */
        public Builder mediaObjects(Output<List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs>> mediaObjects) {
            $.mediaObjects = mediaObjects;
            return this;
        }

        /**
         * @param mediaObjects List of media objects.
         * 
         * @return builder
         * 
         */
        public Builder mediaObjects(List<GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs> mediaObjects) {
            return mediaObjects(Output.of(mediaObjects));
        }

        /**
         * @param mediaObjects List of media objects.
         * 
         * @return builder
         * 
         */
        public Builder mediaObjects(GoogleCloudDialogflowV2IntentMessageMediaContentResponseMediaObjectArgs... mediaObjects) {
            return mediaObjects(List.of(mediaObjects));
        }

        /**
         * @param mediaType Optional. What type of media is the content (ie &#34;audio&#34;).
         * 
         * @return builder
         * 
         */
        public Builder mediaType(@Nullable Output<GoogleCloudDialogflowV2IntentMessageMediaContentMediaType> mediaType) {
            $.mediaType = mediaType;
            return this;
        }

        /**
         * @param mediaType Optional. What type of media is the content (ie &#34;audio&#34;).
         * 
         * @return builder
         * 
         */
        public Builder mediaType(GoogleCloudDialogflowV2IntentMessageMediaContentMediaType mediaType) {
            return mediaType(Output.of(mediaType));
        }

        public GoogleCloudDialogflowV2IntentMessageMediaContentArgs build() {
            $.mediaObjects = Objects.requireNonNull($.mediaObjects, "expected parameter 'mediaObjects' to be non-null");
            return $;
        }
    }

}