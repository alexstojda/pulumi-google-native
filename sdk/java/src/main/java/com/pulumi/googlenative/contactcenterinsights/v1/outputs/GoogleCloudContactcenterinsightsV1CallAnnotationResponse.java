// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.contactcenterinsights.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1EntityMentionDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1HoldDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1IntentMatchDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1InterruptionDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1SentimentDataResponse;
import com.pulumi.googlenative.contactcenterinsights.v1.outputs.GoogleCloudContactcenterinsightsV1SilenceDataResponse;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1CallAnnotationResponse {
    /**
     * @return The boundary in the conversation where the annotation ends, inclusive.
     * 
     */
    private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary;
    /**
     * @return The boundary in the conversation where the annotation starts, inclusive.
     * 
     */
    private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary;
    /**
     * @return The channel of the audio where the annotation occurs. For single-channel audio, this field is not populated.
     * 
     */
    private Integer channelTag;
    /**
     * @return Data specifying an entity mention.
     * 
     */
    private GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData;
    /**
     * @return Data specifying a hold.
     * 
     */
    private GoogleCloudContactcenterinsightsV1HoldDataResponse holdData;
    /**
     * @return Data specifying an intent match.
     * 
     */
    private GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData;
    /**
     * @return Data specifying an interruption.
     * 
     */
    private GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData;
    /**
     * @return Data specifying a phrase match.
     * 
     */
    private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData;
    /**
     * @return Data specifying sentiment.
     * 
     */
    private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;
    /**
     * @return Data specifying silence.
     * 
     */
    private GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData;

    private GoogleCloudContactcenterinsightsV1CallAnnotationResponse() {}
    /**
     * @return The boundary in the conversation where the annotation ends, inclusive.
     * 
     */
    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary() {
        return this.annotationEndBoundary;
    }
    /**
     * @return The boundary in the conversation where the annotation starts, inclusive.
     * 
     */
    public GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary() {
        return this.annotationStartBoundary;
    }
    /**
     * @return The channel of the audio where the annotation occurs. For single-channel audio, this field is not populated.
     * 
     */
    public Integer channelTag() {
        return this.channelTag;
    }
    /**
     * @return Data specifying an entity mention.
     * 
     */
    public GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData() {
        return this.entityMentionData;
    }
    /**
     * @return Data specifying a hold.
     * 
     */
    public GoogleCloudContactcenterinsightsV1HoldDataResponse holdData() {
        return this.holdData;
    }
    /**
     * @return Data specifying an intent match.
     * 
     */
    public GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData() {
        return this.intentMatchData;
    }
    /**
     * @return Data specifying an interruption.
     * 
     */
    public GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData() {
        return this.interruptionData;
    }
    /**
     * @return Data specifying a phrase match.
     * 
     */
    public GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData() {
        return this.phraseMatchData;
    }
    /**
     * @return Data specifying sentiment.
     * 
     */
    public GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData() {
        return this.sentimentData;
    }
    /**
     * @return Data specifying silence.
     * 
     */
    public GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData() {
        return this.silenceData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1CallAnnotationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary;
        private GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary;
        private Integer channelTag;
        private GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData;
        private GoogleCloudContactcenterinsightsV1HoldDataResponse holdData;
        private GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData;
        private GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData;
        private GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData;
        private GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData;
        private GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData;
        public Builder() {}
        public Builder(GoogleCloudContactcenterinsightsV1CallAnnotationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationEndBoundary = defaults.annotationEndBoundary;
    	      this.annotationStartBoundary = defaults.annotationStartBoundary;
    	      this.channelTag = defaults.channelTag;
    	      this.entityMentionData = defaults.entityMentionData;
    	      this.holdData = defaults.holdData;
    	      this.intentMatchData = defaults.intentMatchData;
    	      this.interruptionData = defaults.interruptionData;
    	      this.phraseMatchData = defaults.phraseMatchData;
    	      this.sentimentData = defaults.sentimentData;
    	      this.silenceData = defaults.silenceData;
        }

        @CustomType.Setter
        public Builder annotationEndBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationEndBoundary) {
            this.annotationEndBoundary = Objects.requireNonNull(annotationEndBoundary);
            return this;
        }
        @CustomType.Setter
        public Builder annotationStartBoundary(GoogleCloudContactcenterinsightsV1AnnotationBoundaryResponse annotationStartBoundary) {
            this.annotationStartBoundary = Objects.requireNonNull(annotationStartBoundary);
            return this;
        }
        @CustomType.Setter
        public Builder channelTag(Integer channelTag) {
            this.channelTag = Objects.requireNonNull(channelTag);
            return this;
        }
        @CustomType.Setter
        public Builder entityMentionData(GoogleCloudContactcenterinsightsV1EntityMentionDataResponse entityMentionData) {
            this.entityMentionData = Objects.requireNonNull(entityMentionData);
            return this;
        }
        @CustomType.Setter
        public Builder holdData(GoogleCloudContactcenterinsightsV1HoldDataResponse holdData) {
            this.holdData = Objects.requireNonNull(holdData);
            return this;
        }
        @CustomType.Setter
        public Builder intentMatchData(GoogleCloudContactcenterinsightsV1IntentMatchDataResponse intentMatchData) {
            this.intentMatchData = Objects.requireNonNull(intentMatchData);
            return this;
        }
        @CustomType.Setter
        public Builder interruptionData(GoogleCloudContactcenterinsightsV1InterruptionDataResponse interruptionData) {
            this.interruptionData = Objects.requireNonNull(interruptionData);
            return this;
        }
        @CustomType.Setter
        public Builder phraseMatchData(GoogleCloudContactcenterinsightsV1PhraseMatchDataResponse phraseMatchData) {
            this.phraseMatchData = Objects.requireNonNull(phraseMatchData);
            return this;
        }
        @CustomType.Setter
        public Builder sentimentData(GoogleCloudContactcenterinsightsV1SentimentDataResponse sentimentData) {
            this.sentimentData = Objects.requireNonNull(sentimentData);
            return this;
        }
        @CustomType.Setter
        public Builder silenceData(GoogleCloudContactcenterinsightsV1SilenceDataResponse silenceData) {
            this.silenceData = Objects.requireNonNull(silenceData);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1CallAnnotationResponse build() {
            final var o = new GoogleCloudContactcenterinsightsV1CallAnnotationResponse();
            o.annotationEndBoundary = annotationEndBoundary;
            o.annotationStartBoundary = annotationStartBoundary;
            o.channelTag = channelTag;
            o.entityMentionData = entityMentionData;
            o.holdData = holdData;
            o.intentMatchData = intentMatchData;
            o.interruptionData = interruptionData;
            o.phraseMatchData = phraseMatchData;
            o.sentimentData = sentimentData;
            o.silenceData = silenceData;
            return o;
        }
    }
}