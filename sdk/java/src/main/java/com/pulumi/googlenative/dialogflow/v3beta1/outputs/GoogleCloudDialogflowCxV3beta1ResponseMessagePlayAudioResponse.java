// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse {
    /**
     * @return Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    private Boolean allowPlaybackInterruption;
    /**
     * @return URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    private String audioUri;

    private GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse() {}
    /**
     * @return Whether the playback of this message can be interrupted by the end user&#39;s speech and the client can then starts the next Dialogflow request.
     * 
     */
    public Boolean allowPlaybackInterruption() {
        return this.allowPlaybackInterruption;
    }
    /**
     * @return URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
     * 
     */
    public String audioUri() {
        return this.audioUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowPlaybackInterruption;
        private String audioUri;
        public Builder() {}
        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.audioUri = defaults.audioUri;
        }

        @CustomType.Setter
        public Builder allowPlaybackInterruption(Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Objects.requireNonNull(allowPlaybackInterruption);
            return this;
        }
        @CustomType.Setter
        public Builder audioUri(String audioUri) {
            this.audioUri = Objects.requireNonNull(audioUri);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse build() {
            final var o = new GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioResponse();
            o.allowPlaybackInterruption = allowPlaybackInterruption;
            o.audioUri = audioUri;
            return o;
        }
    }
}