// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.transcoder.v1.outputs.AdBreakResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.EditAtomResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.ElementaryStreamResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.InputResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.ManifestResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.MuxStreamResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.OutputResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.OverlayResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.PubsubDestinationResponse;
import com.pulumi.googlenative.transcoder.v1.outputs.SpriteSheetResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class JobConfigResponse {
    /**
     * @return List of ad breaks. Specifies where to insert ad break tags in the output manifests.
     * 
     */
    private List<AdBreakResponse> adBreaks;
    /**
     * @return List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
     * 
     */
    private List<EditAtomResponse> editList;
    /**
     * @return List of elementary streams.
     * 
     */
    private List<ElementaryStreamResponse> elementaryStreams;
    /**
     * @return List of input assets stored in Cloud Storage.
     * 
     */
    private List<InputResponse> inputs;
    /**
     * @return List of output manifests.
     * 
     */
    private List<ManifestResponse> manifests;
    /**
     * @return List of multiplexing settings for output streams.
     * 
     */
    private List<MuxStreamResponse> muxStreams;
    /**
     * @return Output configuration.
     * 
     */
    private OutputResponse output;
    /**
     * @return List of overlays on the output video, in descending Z-order.
     * 
     */
    private List<OverlayResponse> overlays;
    /**
     * @return Destination on Pub/Sub.
     * 
     */
    private PubsubDestinationResponse pubsubDestination;
    /**
     * @return List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
     * 
     */
    private List<SpriteSheetResponse> spriteSheets;

    private JobConfigResponse() {}
    /**
     * @return List of ad breaks. Specifies where to insert ad break tags in the output manifests.
     * 
     */
    public List<AdBreakResponse> adBreaks() {
        return this.adBreaks;
    }
    /**
     * @return List of `Edit atom`s. Defines the ultimate timeline of the resulting file or manifest.
     * 
     */
    public List<EditAtomResponse> editList() {
        return this.editList;
    }
    /**
     * @return List of elementary streams.
     * 
     */
    public List<ElementaryStreamResponse> elementaryStreams() {
        return this.elementaryStreams;
    }
    /**
     * @return List of input assets stored in Cloud Storage.
     * 
     */
    public List<InputResponse> inputs() {
        return this.inputs;
    }
    /**
     * @return List of output manifests.
     * 
     */
    public List<ManifestResponse> manifests() {
        return this.manifests;
    }
    /**
     * @return List of multiplexing settings for output streams.
     * 
     */
    public List<MuxStreamResponse> muxStreams() {
        return this.muxStreams;
    }
    /**
     * @return Output configuration.
     * 
     */
    public OutputResponse output() {
        return this.output;
    }
    /**
     * @return List of overlays on the output video, in descending Z-order.
     * 
     */
    public List<OverlayResponse> overlays() {
        return this.overlays;
    }
    /**
     * @return Destination on Pub/Sub.
     * 
     */
    public PubsubDestinationResponse pubsubDestination() {
        return this.pubsubDestination;
    }
    /**
     * @return List of output sprite sheets. Spritesheets require at least one VideoStream in the Jobconfig.
     * 
     */
    public List<SpriteSheetResponse> spriteSheets() {
        return this.spriteSheets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<AdBreakResponse> adBreaks;
        private List<EditAtomResponse> editList;
        private List<ElementaryStreamResponse> elementaryStreams;
        private List<InputResponse> inputs;
        private List<ManifestResponse> manifests;
        private List<MuxStreamResponse> muxStreams;
        private OutputResponse output;
        private List<OverlayResponse> overlays;
        private PubsubDestinationResponse pubsubDestination;
        private List<SpriteSheetResponse> spriteSheets;
        public Builder() {}
        public Builder(JobConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adBreaks = defaults.adBreaks;
    	      this.editList = defaults.editList;
    	      this.elementaryStreams = defaults.elementaryStreams;
    	      this.inputs = defaults.inputs;
    	      this.manifests = defaults.manifests;
    	      this.muxStreams = defaults.muxStreams;
    	      this.output = defaults.output;
    	      this.overlays = defaults.overlays;
    	      this.pubsubDestination = defaults.pubsubDestination;
    	      this.spriteSheets = defaults.spriteSheets;
        }

        @CustomType.Setter
        public Builder adBreaks(List<AdBreakResponse> adBreaks) {
            this.adBreaks = Objects.requireNonNull(adBreaks);
            return this;
        }
        public Builder adBreaks(AdBreakResponse... adBreaks) {
            return adBreaks(List.of(adBreaks));
        }
        @CustomType.Setter
        public Builder editList(List<EditAtomResponse> editList) {
            this.editList = Objects.requireNonNull(editList);
            return this;
        }
        public Builder editList(EditAtomResponse... editList) {
            return editList(List.of(editList));
        }
        @CustomType.Setter
        public Builder elementaryStreams(List<ElementaryStreamResponse> elementaryStreams) {
            this.elementaryStreams = Objects.requireNonNull(elementaryStreams);
            return this;
        }
        public Builder elementaryStreams(ElementaryStreamResponse... elementaryStreams) {
            return elementaryStreams(List.of(elementaryStreams));
        }
        @CustomType.Setter
        public Builder inputs(List<InputResponse> inputs) {
            this.inputs = Objects.requireNonNull(inputs);
            return this;
        }
        public Builder inputs(InputResponse... inputs) {
            return inputs(List.of(inputs));
        }
        @CustomType.Setter
        public Builder manifests(List<ManifestResponse> manifests) {
            this.manifests = Objects.requireNonNull(manifests);
            return this;
        }
        public Builder manifests(ManifestResponse... manifests) {
            return manifests(List.of(manifests));
        }
        @CustomType.Setter
        public Builder muxStreams(List<MuxStreamResponse> muxStreams) {
            this.muxStreams = Objects.requireNonNull(muxStreams);
            return this;
        }
        public Builder muxStreams(MuxStreamResponse... muxStreams) {
            return muxStreams(List.of(muxStreams));
        }
        @CustomType.Setter
        public Builder output(OutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        @CustomType.Setter
        public Builder overlays(List<OverlayResponse> overlays) {
            this.overlays = Objects.requireNonNull(overlays);
            return this;
        }
        public Builder overlays(OverlayResponse... overlays) {
            return overlays(List.of(overlays));
        }
        @CustomType.Setter
        public Builder pubsubDestination(PubsubDestinationResponse pubsubDestination) {
            this.pubsubDestination = Objects.requireNonNull(pubsubDestination);
            return this;
        }
        @CustomType.Setter
        public Builder spriteSheets(List<SpriteSheetResponse> spriteSheets) {
            this.spriteSheets = Objects.requireNonNull(spriteSheets);
            return this;
        }
        public Builder spriteSheets(SpriteSheetResponse... spriteSheets) {
            return spriteSheets(List.of(spriteSheets));
        }
        public JobConfigResponse build() {
            final var o = new JobConfigResponse();
            o.adBreaks = adBreaks;
            o.editList = editList;
            o.elementaryStreams = elementaryStreams;
            o.inputs = inputs;
            o.manifests = manifests;
            o.muxStreams = muxStreams;
            o.output = output;
            o.overlays = overlays;
            o.pubsubDestination = pubsubDestination;
            o.spriteSheets = spriteSheets;
            return o;
        }
    }
}